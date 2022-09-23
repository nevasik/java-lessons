package YandexTestingTask;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        Scanner scanner2 = new Scanner(fr);

        int a = scanner2.nextInt();
        int b = scanner2.nextInt();



        FileWriter fw = new FileWriter("output.txt");
        fw.write(String.valueOf(a + b));

        fr.close();
        fw.close();

    }
}
