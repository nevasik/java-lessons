package FunctionalProgrammingPractice;

import java.util.List;
import java.util.OptionalDouble;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);
        OptionalDouble optionalDouble = integers.stream()
                .filter(value -> value % 2 != 0) // не чётные(то есть не деляться на 2)
                .filter(value -> value % 5 == 0) // делющиеся целые числа на 5
                .mapToInt(Integer::intValue)
                .average();
        optionalDouble.ifPresent(System.out::println);
    }
}
