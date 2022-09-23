package inputOutputStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
public class InputStreamRunner {

    public static void main(String[] args) throws IOException {
        /**
         * Если нам нужно считать сразу весь файл по байтово, то используем 2 варинт(но нужно помнить, что это для небольших файлов).
         А если файл большой, и не просто файл, а может даже быть видео которое весит несколько ГБ, то нужно считывать небольшими порциями, как в варианте 1.
         */

        // Вариант 1
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        //
            // Вариант 2
            /**
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
             */
        }
    }
}
