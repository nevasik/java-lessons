package Alishev.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // принимает на вход кол-во поток, выполняющие какие-то операции

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i)); // передали нашим работникам 5 заданий
        }
        executorService.shutdown(); // прекратили передачу новых заданий, и отправил работников выполнять те 5 заданий выше
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS); // говорим, что бы наши потоки выполнили задание в течении одного дня
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work " + id + " was completed");
    }
}
