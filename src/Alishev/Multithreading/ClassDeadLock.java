package Alishev.Multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClassDeadLock {

    public static void main(String[] args) throws InterruptedException {
        Runners runners = new Runners();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runners.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runners.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runners.finished(); // что бы выполнить какой-то код, после того, как все наши потоки выполнят наши методы
    }
}

class Runners {
    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2){
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                if (firstLockTaken) {
                    lock1.unlock();
                }

                if (secondLockTaken) {
                    lock2.unlock();
                }
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void firstThread() { // выполняет первый поток
        Random random = new Random();

        for (int i = 0; i < 10_000; i++) {
            takeLocks(lock1, lock2);

            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() { // выполняет второй поток
        Random random = new Random();

        for (int i = 0; i < 10_000; i++) {
            takeLocks(lock2, lock1);

            try {
                Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock(); // всегда должны быть в finally блоке
                lock2.unlock(); // всегда должны быть в finally блоке
            }
        }
    }

    public void finished() { // вызываем тогда, когда два потока выполнят свой код
        System.out.println("Баланс первого аккаунта " + account1.getBalance());
        System.out.println("Баланс второго аккаунта " + account2.getBalance());
        System.out.println("Total balance " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account {
    private int balance = 10_000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withDraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account account1, Account account2, int amount) {
        account1.withDraw(amount);
        account2.deposit(amount);
    }
}