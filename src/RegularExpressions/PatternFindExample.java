package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "lllgkens +375 (33) 898-33-13 gvbkdsjbv ksjdfbsk +375 (44) 777-12-13" +
                "jkfsa +375 (29) 657-13-29 akjfbak +375 (25) 111-11-11 alksjbb";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?(\\d{3})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex); // передаём наше регулярное выражение
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder(); // создаём для замены подстрок


        while (matcher.find()) { // что бы искать наши номера среди строки
            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);
            matcher.appendReplacement(stringBuilder, "$2 - $3 - $4"); // задаём вторым аргументом, что у нас лежит в phoneNumber(разделение частей(часть1, часть2, часть3))

//            System.out.println(matcher.group()); // что бы отобразить наши номера
//            System.out.println(matcher.group(0));
//            System.out.println(matcher.group("code"));
        }
        matcher.appendTail(stringBuilder); // что бы вывести конец строки, т.к. при замене телефона на XXX, у нас пропадает всё, что находиться после последнего телефона

        System.out.println(stringBuilder.toString()); // выводим нашу замененную строку
        System.out.println(phoneNumber.replaceAll(regex, "$2 - $3 - $4 | "));
    }
}
