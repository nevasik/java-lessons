package FunctionalProgrammingHomework;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;
public class Task {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Dima", "Joingov", 1, List.of(5, 4, 5, 5, 5, 4)),
                new Student("Marina", "Igohorka", 4, List.of(2, 4, 3)),
                new Student("Alex", "Flash", 2, List.of(5, 5)),
                new Student("Maxim", "Slavvon", 4, List.of(5, 5, 5, 5, 5, 5, 5)),
                new Student("Bob", "Bobov", 3, List.of(3, 3, 4)),
                new Student("Volodya", "Popov", 5, List.of(4, 4, 3, 5, 4, 3)),
                new Student("Vasya", "Glushkov", 1, List.of(2, 2, 3, 2))
        );
        Map<Integer, Double> result1 = list.stream()
                .filter(s -> s.getEvaluations().size() > 3)
                .collect(groupingBy(Student::getNumberOfCourse, flatMapping(l -> l.getEvaluations().stream(), averagingInt(Integer::intValue))));
        System.out.println(result1);
        /**
         * collect - собирает из стрима в мапу
         * groupingBy - ключ + значение у мапы
         * Student::getNumberOfCourse - ключ у мапы(курс у студента)
         * flatMapping(l -> l.getEvaluations().stream() - делает один стрим из списка списков оценок
         * averagingInt(Integer::intValue) - находит среднее значение(значение у мапы)
         */

        Map<Integer, List<Student>> result2 = list.stream()
                .collect(groupingBy(Student::getNumberOfCourse, mapping(s -> new Student(s.getName(), s.getSurname()), collectingAndThen(toList(), l -> l.stream()
                .sorted(comparing(Student::getName)
                .thenComparing(Student::getSurname)).collect(toList())))));
        System.out.println(result2);
        /**
         * collect - собирает из стрима в мапу
         * groupingBy - ключ + значение у мапы
         * Student::getNumberOfCourse - ключ у мапы(курс у студента)
         * mapping(s -> new Student(s.getName(), s.getSurname()) -
         * collectingAndThen(toList(), l -> l.stream() -
         * sorted(comparing(Student::getName) - сортируемся по имени
         * thenComparing(Student::getSurname)) - и ещё сортируемся по фамилии
         * collect(toList()) - собираем всё в список
         */


    }

}
