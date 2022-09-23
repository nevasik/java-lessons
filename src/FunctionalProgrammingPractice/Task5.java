package FunctionalProgrammingPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class Task5 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanov", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov", 56)
        );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15) // созданный метод(имя и фамилия) размер не должен превышать 15
                .max(Comparator.comparing(Person::getAge)) // находим максимальное(сортируемся по возрасту)
                .map(Person::getFullName)
                .ifPresent(System.out::println);
        Map<Integer, List<String>> map = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList()))); // группировка только fullName, после преобразование в List

        Map<Integer, Person> personMap = persons.stream()
                .collect(toMap(Person::getAge, Function.identity()));
        System.out.println(map);
    }
}
