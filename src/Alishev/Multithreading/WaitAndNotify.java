package Alishev.Multithreading;

import java.util.Scanner;
public class WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer wn2 = new ProducerConsumer();
        Thread thread1 = new Thread(new Runnable() {
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

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
class ProducerConsumer {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            // == (this.wait) только в synchronized блоке
            wait(); // 1 - отдаём intrinsic lock, 2 - ждём пока будет вызван notify().
            System.out.println("Producer thread resumed...");
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine(); // этот поток будет ждать, пока мы не нажмём enter
            notify();

            Thread.sleep(5000);
        }
    }
}
