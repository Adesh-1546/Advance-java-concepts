package Multithreading;

class SharedResource {

    private boolean hasData = false;

    public synchronized void produce() {

        System.out.println("Producing data...");
        hasData = true;

        notify(); // wake up waiting thread
    }

    public synchronized void consume() {

        while (!hasData) {
            try {
                wait(); // wait until data is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consuming data...");
        hasData = false;
    }
}

public class WaitNotifyExample {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            resource.produce();
        });

        Thread consumer = new Thread(() -> {
            resource.consume();
        });

        consumer.start();
        producer.start();
    }
}

/*
Expected Output:

Producing data...
Consuming data...

👉 Consumer waits until producer notifies
*/
