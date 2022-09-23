package ExceptionPractice;

public class Task1 {

    public static void main(String[] args) {
        String value = null;
        try {
            System.out.println(value.length());
        }
        catch (RuntimeException exception) {
            System.err.println("Ошибка, длина строки равна нулю");
        }
    }
}
