package RegularExpressionsPractice;

/**
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметр, например <p id="p1">,
 * и замену их на простые теги абзацев <p>.
 */
public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p>wfaag qwegrfq </p> <b> alshgao </b> sasrgfaf afaf <p id=\"p1\">flfls lskfn</p> " +
                "fskfjs <p>fwfw wfew <p id=\"p2\">2133 df</p> asfa";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
