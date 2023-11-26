package juc.test;

public class TreadLocal_member_variable extends Thread {
    private int sharedCounter;

    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public TreadLocal_member_variable(String name) {
        super(name);
        this.sharedCounter = 0;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            incrementCounter();
            threadLocal.set(0);
            threadLocal.get();
            System.out.println(Thread.currentThread().getName() + ": Counter = " + sharedCounter);
        }
    }

    private synchronized void incrementCounter() {
        // 使用 synchronized 关键字确保线程安全
        sharedCounter++;
        sharedCounter++;
    }

    private synchronized void decrementCounter() {
        // 使用 synchronized 关键字确保线程安全
        sharedCounter--;
    }

    public static void main(String[] args) {
        TreadLocal_member_variable thread1 = new TreadLocal_member_variable("Thread 1");
        TreadLocal_member_variable thread2 = new TreadLocal_member_variable("Thread 2");

        thread1.start();
        thread2.start();
    }
}
