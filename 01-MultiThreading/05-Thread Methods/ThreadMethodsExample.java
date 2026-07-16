package Multithreading;

public class ThreadMethodsExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            System.out.println("Thread started");

            try {
                // 🔹 sleep()
                Thread.sleep(2000);
                System.out.println("After sleep");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread finished");
        });

        // 🔹 setPriority()
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();

        try {
            // 🔹 join()
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues after join");

        // 🔹 yield()
        Thread.yield();

        System.out.println("Main thread finished");
    }
}

/*
Expected Output:

Thread started
(after ~2 sec delay)
After sleep
Thread finished
Main thread continues after join
Main thread finished

👉 join() ensures main waits for t1
👉 sleep() pauses thread
👉 yield() may or may not affect execution
*/
