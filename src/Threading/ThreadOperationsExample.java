package Threading;

class MyThreadd extends Thread {
    public void run() {
        System.out.println(getName() + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " count: " + i);
            try {
                Thread.sleep(500); // pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " finished.");
    }
}

public class ThreadOperationsExample {
    public static void main(String[] args) {
        MyThreadd t1 = new MyThreadd();
        MyThreadd t2 = new MyThreadd();

        // Set thread names
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Start both threads
        t1.start();
        t2.start();

        // Check if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        // Wait for t1 to finish before main continues
        try {
            t1.join();  // Main thread waits until t1 completes
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println(t1.getName() + " has finished. Main thread continues.");

        // Wait for t2 to finish too (optional)
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread ends.");
    }
}

