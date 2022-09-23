package Alishev.Multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class PatternProducerConsumer {
    private static BlockingQueue<Integer> queue = new  ArrayBlockingQueue<>(10);
    // queue - это очередь грубо говоря

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // что бы подождать, пока наши потоки выполняться(не даёт поток идти дальше, пока не выполнят действие выше)
        thread2.join();
    }

    private static void produce() throws Exception { // пишущий поток
        Random random = new Random();

        while (true) {
            queue.put(random.nextInt(100)); // помещаем случайно число от 0 до 100 в наш queue
        }
    }

    private static void consumer() throws Exception { // потребитель потоков
        Random random = new Random();
        while (true) {
            Thread.sleep(100);

            if (random.nextInt(10) == 5) { // сделали так, что бы реже вытаскивать числа
                System.out.println(queue.take()); // забираем число из нашего queue
                System.out.println("queue size is " + queue.size()); // выведем размер нашей очереди queue
            }
        }
    }
}
