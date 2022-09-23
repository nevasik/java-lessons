package FunctionalProgramming;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string) // -> - равняется(=)
                .map(Integer :: valueOf) // преобразование из ссылочного типа String в Integer
                .filter(value -> value % 2 == 0) // == условие
                .sorted() // сортировка с самого меньшего и выше
                .skip(1) // начинает со второго элемента List
                .limit(2) // ограничивает вывод в два числа
                .mapToInt(Integer :: intValue) // преобразование ссылочного типа Integer в примитивный тип данных int
                //.mapToObj(Integer :: valueOf) // преобразование примитивного типа int в ссылочный тип Integer
                .summaryStatistics(); // вывод статистики(count, min, max, avg, sum)
        System.out.println(intSummaryStatistics);
                //.forEach(System.out::println); // что бы вывести числа ссылочного типа Integer

        // создание Stream из примитивных типов
//        List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//        IntStream.range(0, 10) // аналог цикла for(от 0 до 10)
//                .forEach(System.out::println);

        IntStream.iterate(0, operand -> operand + 3) // делаем бесконечный цикл с лимитом 20, пропускаем первые 10, и выводим на экран 20 чисел
                .skip(10)
                .limit(20)
                .forEach(System.out :: println);

        // выше аналог данных операций
//        for (String string : strings) {
//            String value = string + string;
//            Integer intValue = Integer.valueOf(value);
//            if (intValue % 2 == 0) {
//                System.out.println(intValue);
//            }
//        }
    }
}
