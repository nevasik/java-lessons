package Alishev.Multithreading;

import java.util.concurrent.*;

public class ClassSemaphore {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown(); // мы закончили действие
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

// паттерн Singleton
class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount = 0;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() { // мы запрещаем пользователям, создавать объекты этого класса.
    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}

// Semaphore semaphore = new Semaphore(3); // указываем сколько максимум потоков будут работать

//        try {
//            semaphore.acquire(); // вызываем в том случае, когда мы в потоке начинаем взаимодействие с ресурсом
//            semaphore.acquire();
//            semaphore.acquire();
//
//            System.out.println("All permits have been acquire");
//
//            semaphore.acquire();
//
//            System.out.println("Can't reach here...");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        semaphore.release(); // вызываем тогда, когда заканчиваем в потоке использовать ресурс
//
//        System.out.println(semaphore.availablePermits()); // этот метод возвращает кол-во разрешений, которые у нас есть

