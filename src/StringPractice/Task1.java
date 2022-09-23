package StringPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        String result = smile(value);
        System.out.println(result);

//        boolean result = indexOfCity("Arseniy");
//        System.out.println(result);
    }
    private static String smile(String value){
        String sadness = ":(";
        String fun = ":)";
        return value.replace(sadness, fun);
    }

//    private static boolean indexOfCity(String name) {
//        return name.startsWith("Ar");
//    }
}
