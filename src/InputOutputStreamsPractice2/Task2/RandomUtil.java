package InputOutputStreamsPractice2.Task2;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;
public final class RandomUtil {

    public static final int DEFAULT_BOUND = 1000;
    public static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getRandomValue() {
        return getRandomValue(DEFAULT_BOUND);
    }

    public static int getRandomValue(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static List<String> generateDigits(int limit) {
        return IntStream.iterate(0, value -> value + 1)
                .limit(limit)
                .map(it -> getRandomValue())
                .mapToObj(String::valueOf)
                .collect(toList());
    }
}
