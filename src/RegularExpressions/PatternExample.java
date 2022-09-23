package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        // Делаем проверку на ввод нашего номера, с помощью регулярных выражений, в 12 строке
        // первый вариант записи
        String phoneNumber = "+375 (29) 898-12-13";
        String regex = "(\\+375)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());

        // второй вариант записи
        System.out.println(Pattern.matches(regex, phoneNumber));

        // третий вариант
        System.out.println(phoneNumber.matches(regex));
    }
}
