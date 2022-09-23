package FunctionalProgrammingPractice;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );
        // первый вариант
        int result = strings.stream()
                .filter(value -> value.length() > 8) // условие
                .collect(Collectors.toSet()) // преобразование из stream в set
                .size(); // подсчёт таких слов
        System.out.println(result); // вывод размера

        // второй вариант
        long result2 = strings.stream()
                .filter(value -> value.length() > 8) // условие
                .distinct() // используется для удаления дубликатов
                .count(); // подсчёт таких слов
        System.out.println(result2);
    }
}
