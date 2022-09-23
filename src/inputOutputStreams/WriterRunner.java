package inputOutputStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        //File list = Path.of("resources", "writer.poem").toFile();
        Path path = Path.of("resources", "writer2.poem");
        Files.write(path, List.of("Hello world", "Java"));
//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(path, true))) {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
            fileWriter.append("Hello world");
            fileWriter.newLine(); // что бы печаталось с новой строки
            fileWriter.append("Java");
        }
    }
}
