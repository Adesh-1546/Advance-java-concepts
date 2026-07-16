package Multithreading;

// Creating thread by extending Thread class
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class ThreadClassExample {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start(); // starts new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}

/*
Possible Output (order may vary):

Main thread: 1
Thread running: 1
Main thread: 2
Thread running: 2
Main thread: 3
Thread running: 3
Main thread: 4
Thread running: 4
Main thread: 5
Thread running: 5

OR

Thread running: 1
Thread running: 2
Main thread: 1
Main thread: 2
...

👉 Output is NOT fixed because threads run concurrently
*/
