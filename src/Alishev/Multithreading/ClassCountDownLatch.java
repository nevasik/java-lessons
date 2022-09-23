package Alishev.Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ClassCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3); //CountDownLatch - сколько мы должны вызывать метод countDown из любого кол-во потоков
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(i, countDownLatch)); // назначили нашему ExecutorService задание(new Processor(countDownLatch))
        }
        executorService.shutdown(); // что бы программа завершилась

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }
//        countDownLatch.await(); // метод, который ожидает, что бы наш CountDownLatch станет 0
//        System.out.println("Latch has been opened, main thread is proceeding");
    }
}

class Processor implements Runnable {
    private int id;
    private CountDownLatch countDownLatch;

    public Processor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            countDownLatch.await(); // отсчитывает назад у CountDownLatch
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id + "proceeded");
    }
}
