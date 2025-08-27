package Oops.Abstraction;

public class Bike extends Vehicle {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Override
    void start() {
        System.out.println("I will start");
    }
}
