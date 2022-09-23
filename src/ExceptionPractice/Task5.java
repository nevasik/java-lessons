package ExceptionPractice;

public class Task5 {
    public static void main(String[] args) {
        try {
            catchCustomException();
        }
        catch (DimaException exception) {
            System.out.println("Catched in main");
            exception.printStackTrace();
        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        }
        catch (RuntimeException exception) {
            System.out.println("Catch int catchCustomException method");
            throw new DimaException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Oooops");
    }
}
