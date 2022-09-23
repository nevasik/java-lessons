package ExceptionLessons;

import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe(10);
        } catch (Exception exception) {
            System.err.println("Возникла непредвиденная ошибка, попробуйте позже");
        } finally {
            // блок finally в любом случае выполняется
            System.out.println("finally");
        }
        System.out.println("main end");
    }

    public static void unsafe(int value) throws FileNotFoundException, NoSuchFileException {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
    }
}
