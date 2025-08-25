package Threading;

public class WithoutVolatile {
    public static void main(String[] args) throws InterruptedException {
        Task t = new Task();
        t.start();

        Thread.sleep(1000); // Let thread run for 1 sec
        System.out.println("Main: requesting stop");
        t.stopTask();
    }
}

class Task extends Thread {
    private volatile boolean running = true;

    public void run() {
        System.out.println("Thread started");
        while (running) {
            // Busy loop
        }
        System.out.println("Thread stopped");
    }

    public void stopTask() {
        running = false;
    }
}
