package ExceptionPractice;

public class DimaException extends RuntimeException {
    public DimaException(String message) {
        super(message);
    }
    public DimaException(Throwable cause) {
        super(cause);
    }
}
