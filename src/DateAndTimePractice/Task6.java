package DateAndTimePractice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 5. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        LocalDateTime localDateTimeNow = now.atStartOfDay(); // полуночь(начало нового дня)
        LocalDateTime localDateTimePrev = prevDate.atStartOfDay(); // полуночь(начало нового дня)

        Duration duration = Duration.between(localDateTimePrev, localDateTimeNow); // разница между первым и вторым днём
        System.out.println(duration.getSeconds()); // вызов в секундах
    }
}
