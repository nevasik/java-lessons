package StringLesson2;
/** Дана строка с текстом, в котором есть цифры от 0 до 9. Написать 2 метода:
 - возвращающий массив цифр из переданной строки
 - возвращающий сумму цифр из переданного целочисленного массива
 Посчитать сумму всех чисел из строки
 Например:
 “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {
    public static void main(String[] args) {
        String data = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println(sum(getNumbers(data)));
    }

    public static int[] getNumbers(String line) {
        int[] array = new int[5];
        int index = 0;
        for (int i = 0; i < line.length(); i++) {
            int number = Character.getNumericValue(line.charAt(i));
            if (number != -1) {
                array[index++] = number;
            }
        }
        return array;

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}