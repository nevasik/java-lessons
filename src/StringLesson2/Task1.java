package StringLesson2;
/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 *
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {
    public static void main(String[] args) {
        String[] array = "abc Cpddd Dio OsfWw".split("");
        System.out.println(deleteSymbols(array));

    }
    private static StringBuilder deleteSymbols(String[] value) {
        String prev = "";
        StringBuilder builder = new StringBuilder(prev);
        for (int i = 0; i < value.length; i++) {
            String current = value[i].toUpperCase();
            if (current.equals(" ")) continue;
            if (!current.equals(prev)) {
                prev = current;
                builder.append(current);
            }
        }
        return builder;
    }
}
