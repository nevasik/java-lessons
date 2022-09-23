package StringPractice;

public class Task2 {
    public static void main(String[] args) {
        String str = "hello";
        String value = "hellogheofenhello";
        boolean result = startsString(str, value);
        System.out.println(result);
    }

    private static boolean startsString(String str, String value){
        return value.startsWith(str) && value.endsWith(str);
    }
}
