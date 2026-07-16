package Multithreading;

// Creating thread using Runnable
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread: " + i);
        }
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        MyRunnable task = new MyRunnable();
        Thread t1 = new Thread(task);

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}

/*
Possible Output:

Main thread: 1
Runnable thread: 1
Main thread: 2
Runnable thread: 2
...

👉 Output order is unpredictable (thread scheduling)
*/
