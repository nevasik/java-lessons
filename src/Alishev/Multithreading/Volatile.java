package Alishev.Multithreading;

import java.util.Scanner;
public class Volatile {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread2 extends Thread {
    private volatile boolean running = true; // volatile - ключевое слово, с помощью которого, наша переменная не попадёт в кеш, и будет всегда в общей памяти.
    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown() {
        this.running = false;

    }
}
