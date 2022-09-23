package FunctionalProgramming;

import java.util.Comparator;

public class LambdaExample  {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(25, 100));
    }

    //private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        // [модификаторы.] возвр название([параметры])

//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }
}

