package Threading;

class BoilWater extends Thread {
    public void run() {
        System.out.println("Boiling water...");
        try {
            Thread.sleep(5000); // Simulate 5 seconds
        } catch (Exception e) {}
        System.out.println("Water is boiled!");
    }
}

public class TeaMaking {
    public static void main(String[] args) {
        BoilWater t1 = new BoilWater();
        t1.start(); // Start boiling water

        try {
            t1.join(); // Wait here until t1 finishes boiling water
        } catch (InterruptedException e) {}

        System.out.println("Now add tea leaves and sugar."); // Happens after water is boiled
    }
}

