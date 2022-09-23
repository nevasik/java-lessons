package DateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();// текущая дата время зона
        System.out.println(now);

        long toEpochMilli = now.toInstant().toEpochMilli(); // получаем кол-во миллисекунд, начиная с 1 января 1970 года
        System.out.println(toEpochMilli);

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS); // изменили текущую дату, на +1 день
        System.out.println(plus);

        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS); // обнулили до дня(вывелось всё до дня, т.е. время по нулям)
        System.out.println(zonedDateTime); // делается для того, что бы начать новый день

        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
    }
}
