package Alishev.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Synchronized1 {
    public static void main(String[] args) throws Exception {
        new Worker().main();
    }
}
class Worker {
    Object object1 = new Object();
    Object object2 = new Object();
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    public void addToList1() {
        synchronized (object1) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100)); // одно случайное число от 0 до 100
        }
    }
    public synchronized void addToList2() {
        synchronized (object2) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }

            list2.add(random.nextInt(100)); // одно случайное число от 0 до 100
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }
    public void main() {
        long before = System.currentTimeMillis();
//                                              // в миллисекундах
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");
        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}


// synchronized - с помощью него переменная counter будет синхронизированная, а значит, что второй поток будет ждать, пока первый закончит свою работу
//    public synchronized void increment() {
//            counter++;
//    }
//    public void doWork() throws InterruptedException {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000; i++) {
//                    increment();
//                }
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000; i++) {
//                    increment();
//                }
//            }
//        });
//
//        thread.start();
//        thread2.start();
//
//        thread.join();
//        thread2.join();
//
//        System.out.println(counter);
//    }
