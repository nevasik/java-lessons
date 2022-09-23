package HomeWork2;

import CollectionHomework.Movie;

/** Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях.
 */
public class Task1 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String value = "hello";
        boolean result = isPalindrome(value);
        System.out.println(result);
    }

    public static boolean isPalindrome(String value) {
        String withoutSpaceValue = value.replace(SPACE, EMPTY);
        return new StringBuilder(withoutSpaceValue).reverse().toString().equalsIgnoreCase(withoutSpaceValue);
        /**
         * replace - заменяет символы первого аргумента, на вторые
         * reserve - возвращает StringBuilder, с обратной последовательностью
         * toString - что бы перевести строку из StringBuilder
         * equalsIgnoreCase — сравнивает данную строку с другой строкой, игнорируя регистр
         * Две строки считаются равными, если они имеют одинаковую длину и соответствующие символы у двух строк равны, игнорируя регистр букв
         */
    }

    public static boolean palindrome(String str){
        String value = str.replace(SPACE, EMPTY);
        return new StringBuilder(value).reverse().toString().equalsIgnoreCase(value);
    }
}
