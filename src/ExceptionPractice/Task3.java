package ExceptionPractice;

public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DimaException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
    public static void unsafe() {
        throw new DimaException(new RuntimeException("runtime exception"));
    }
}
