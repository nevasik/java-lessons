package YandexTestingTask;

import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        int A = scanner.nextInt(); // стоимость тарифа Кости
        int B = scanner.nextInt(); // размер тарифа Кости
        int C = scanner.nextInt(); // стоимость каждого лишнего мегабайта
        int D = scanner.nextInt(); // размер интернет-трафика Кости в след.месяце

        int d = 0;
        for (int i = 10; i < D; i++) {
            d++;
        }

        if (D <= B) {
            result = A;
        } else {
            result = C * d + A;
        }

        System.out.println(result);
    }
}
