package Multithreading;

// Creating thread by extending Thread class
class MyThread extends Thread {

    @Override
    public void run() {
        // Code executed by thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class ThreadClassExample {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start(); // starts new thread (IMPORTANT)

        // main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}
