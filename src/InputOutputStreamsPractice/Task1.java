package InputOutputStreamsPractice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class Task1 {

    private static final String VOWELS = "уеыаоэяиюё";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while(scanner.hasNext()) {
                String word = scanner.next(); // засовываем в строку слова
                char firstSymbol = word.charAt(0); // берём в char первый элемент у каждого слова и дальше его проверяем
                if (VOWELS.indexOf(firstSymbol) != -1) { // indexOf - возвращает - 1 если символ не встречается, а значит что мы можем задать условие != -1
                    System.out.println(word);
                }
            }
        }
    }
}
