package RegularExpressionsPractice;

import java.util.regex.Pattern;

/**
 * Написать программу, проверяющую является ли введённая строка адресом почтового ящика. В названии почтового ящика разрешить использование только
 * букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы. Возможные домены верхнего уровня: .org .com
 */
public class Task1 {

    public static void main(String[] args) {
        // классификатор '+' означает от 1 до бесконечности
        String regex = "[a-zA-Z]\\w+@\\w{3,}\\.(org|com)"; // (\\w) - означает только буквы, цифры и нижние подчёркивания
        String input = "dmdev@gmail.com";
        System.out.println(Pattern.matches(regex, input));
    }
}
