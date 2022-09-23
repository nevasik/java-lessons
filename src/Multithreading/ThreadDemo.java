package Multithreading;

public class ThreadDemo {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        var runnableThread = new Thread(new SimpleRunnable(), "My Name");
        var lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));

        simpleThread.start(); // создали новый поток
        runnableThread.start();
        lambdaThread.start();
        try {
            simpleThread.join(); // поток, который будет вызываться вечно, пока метод main его не закроет
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        simpleThread.interrupt(); // метод, говорящий потоку, как сможешь, так и остановись
        System.out.println(Thread.currentThread().getName());
    }
}
