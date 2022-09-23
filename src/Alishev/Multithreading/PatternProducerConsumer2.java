package Alishev.Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class PatternProducerConsumer2 {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer5 wn2 = new ProducerConsumer5();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn2.produce();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn2.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        th.start();
        thread2.start();

        th.join();
        thread2.join();
    }
}
class ProducerConsumer5 {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
            
        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}

