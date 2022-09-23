package StringPractice;

public class Task4 {
    public static void main(String[] args) {
        String value = "kwbf,pwfek.wfehwoeu!wpkjw,ipwhf.ofwjeo!";
        Integer result = countSymbols(value);
        System.out.println(result);
    }
    private static int countSymbols(String value){
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
