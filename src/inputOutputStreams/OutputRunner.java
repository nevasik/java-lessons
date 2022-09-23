package inputOutputStreams;

import java.io.*;
import java.nio.file.Path;
public class OutputRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) { // если нужно несколько раз записать одно и то же, то вторым аргументом указываем true
            String value = " Hello world ";
            fileOutputStream.write(value.getBytes()); // делаем запись в файл
            fileOutputStream.write(System.lineSeparator().getBytes()); // чтобы записать значение с новой строки
        }
    }
}
