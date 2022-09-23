package StringPractice;

public class Task3 {
    public static void main(String[] args) {
        String name = "dima";
        String surname = "poplaukhin";
        String patronymic = "sergeevich";
        String result = initial(name, surname, patronymic);
        System.out.println(result);
    }

    private static String initial(String name, String surname, String patronymic){
//        String result = surname.charAt(0) + "." + name.charAt(0) + "." + patronymic.charAt(0);
        String result = String.format("%s.%s.%s", surname.charAt(0), name.charAt(0), patronymic.charAt(0));
        return result.toUpperCase();
    }
}
