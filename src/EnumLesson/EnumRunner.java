package EnumLesson;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType); // значение - BIT_32
        System.out.println(processorType.name()); // значение
        System.out.println(ProcessorType.valueOf("BIT_32")); // valueOf - находит значение по названию(true-название; false - исключение)
        System.out.println(Arrays.toString(ProcessorType.values())); // выводит все значения в enum
        System.out.println(ProcessorType.BIT_32.ordinal()); // выводит индекс значения
        System.out.println(processorType.getName());
        System.out.println(processorType.getDescription());
    }
}
