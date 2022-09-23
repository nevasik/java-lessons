package Alishev.Multithreading;

public class Test {

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

//        System.out.println("I am going to sleep");
//        Thread.sleep(3000); // поток прерывает свою работу, и ждёт 3000 миллисекунд(3 сек)
//        System.out.println("I am awake!");
        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello from main Thread");
    }
}

class Runner implements Runnable { // этот способ более лучше, чем способ ниже

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}

/*
  Потоки в Java не синхронизированы.

  Существует несколько методов, создания потоков. Мы сделали так: унаследоваться от класса Thread, и переопределить метод run,
  и потом в главном потоке вызывать метод start.

  Существует такой статический метод sleep который будучи вызванный в потоке он заставляет этот поток лечь спать т.е.
  прекратить своё выполнение на какой-то промежуток времени
 */
