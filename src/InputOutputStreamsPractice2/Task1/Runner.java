package InputOutputStreamsPractice2.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
public class Runner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "Pushkin.txt");
        Map<Character, Integer> frequency = CharacterHelper.calcFrequency(path);

        Path resultPath = Path.of("resources", "task1-result.txt");
        Files.write(resultPath, CharacterHelper.toListRepresentation(frequency), CREATE, TRUNCATE_EXISTING);
    }
}
