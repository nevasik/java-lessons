package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

/** 1. Написать метод, который принимает целочисленный список и возвращает
 целочисленный список только с нечетными значениями.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 5, 6, 8, 9, 3, 7, 6);
        List<Integer> result = numberOdd(list);
        System.out.println(result);
    }

    private static List<Integer> numberOdd(List<Integer> integerList) {
        List<Integer> list = new ArrayList<>();
        for (Integer integer : integerList) {
            if (integer % 2 != 0) {
                list.add(integer);
            }
        }
        return list;
    }
}
