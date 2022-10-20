package Alishev.FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        // map method(делает какие то операции с числами(прибавление, вычитание и т.д.))
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray(); // map - берёт наш элемент и начинает по нему итерироваться(работает как for). toArray - взял наш поток stream и преобразовал его в наш массив
        list1 = list1.stream().map(a -> a * 2).toList(); // toList - берёт наш поток, и преобразовывает его в наш List

        arr1 = Arrays.stream(arr1).map(a -> 3).toArray(); // перевод каждого нашего элемента в тройку
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray(); // добавление к каждому нашему элементу 1

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        // filter method(делает какую то выборку чисел по заданным критериям(return true or false))
        int [] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray(); // возвращает только чётные числа из массива
        list2 = list2.stream().filter(a -> a % 2 == 0).toList(); // возвращает только чётные числа из List

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        // foreach method() - проходиться по всем элементам коллекции
        Arrays.stream(arr2).forEach(System.out::println); // выводим каждый элемент из коллекции итерацией
        list2.stream().forEach(System.out::println);

        // reduce method() - берёт набор данных и сжимает их в один элемент(пример посчитать сумму всех элементов)
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(arr3);
        fillList(list3);

        // [1, 2, 3] -> acc(1), b(2) -> 2 + 1 = 3 -> acc(3), b(3) -> 3 + 3 = 6 -> return acc(6)
        System.out.println(Arrays.toString(arr3));
        System.out.println(list3);
        int sum1 = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt(); // getAsInt - перевести наш поток в целое число
        int product = list3.stream().reduce((acc, b) -> acc * b).get();// acc - аккумулятор; b - текущее значение

        System.out.println(sum1);
        System.out.println(product);

        int[] arr4 = new int[10];
        fillArr(arr4);

        int [] newArray = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet()); // Collectors.toSet() - перевести из потоков в Set
        System.out.println(set);
    }
    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
    private static void fillArr(int [] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
