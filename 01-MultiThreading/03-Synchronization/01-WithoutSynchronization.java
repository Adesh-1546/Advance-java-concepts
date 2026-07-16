package Multithreading;

class Counter {
    int count = 0;

    public void increment() {
        count++; // NOT thread-safe
    }
}

public class WithoutSynchronization {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);
    }
}

/*
Expected Output:
Final Count: < 2000 (like 1785, 1950, etc.)

👉 Due to race condition
--------------------------------------------
count++ is NOT atomic:
Read
Increment
Write
👉 Threads interfere → wrong result
*/
