package inputOutputStreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReaderRunner {
    /**
     * Мы записываем из файла, с помощью BufferedReader, который делает это быстрее чем просто Reader/
     */
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
//            String result = fileReader.lines()
//                    .collect(Collectors.joining("\n"));
//            System.out.println(result);
//        }
    }
}
