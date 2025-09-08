package Oops.Interface;
abstract class Smartphone {
    String brand;
    String model;
    int storage;

    Smartphone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    void call(String number) {
        System.out.println(brand + " " + model + " calling " + number);
    }

    void sms(String number, String message) {
        System.out.println(brand + " " + model + " SMS to " + number + ": " + message);
    }
    // abstract → each phone unlocks differently
    abstract void unlock();
}

// Interfaces → optional features
interface Camera {
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer {
    void playMusic(String song);
}

interface FiveG {
    void connect5G();
}

// Samsung → has camera, music, and 5G
class Samsung extends Smartphone implements Camera, MusicPlayer, FiveG {
    Samsung(String brand,String model, int storage) {
        super(brand, model, storage);
    }

    @Override
    void unlock() {
        System.out.println("Samsung " + model + " unlocked using Fingerprint.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Samsung " + model + " took a photo.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Samsung " + model + " recorded a video.");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Samsung " + model + " playing: " + song);
    }

    @Override
    public void connect5G() {
        System.out.println("Samsung " + model + " connected to 5G.");
    }
}

// iPhone → has camera + music, but no 5G here
class iPhone extends Smartphone implements Camera, MusicPlayer {
    iPhone(String model, int storage) {
        super("Apple", model, storage);
    }

    @Override
    void unlock() {
        System.out.println("iPhone " + model + " unlocked using Face ID.");
    }

    @Override
    public void takePhoto() {
        System.out.println("iPhone " + model + " took a photo.");
    }

    @Override
    public void recordVideo() {
        System.out.println("iPhone " + model + " recorded a video.");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("iPhone " + model + " playing: " + song);
    }
}

// Nokia → only basic features, no camera/music/5G
class Nokia extends Smartphone {
    Nokia(String model, int storage) {
        super("Nokia", model, storage);
    }

    @Override
    void unlock() {
        System.out.println("Nokia " + model + " unlocked using PIN code.");
    }
}

// Practice.Main Practice.Test Class
public class Test3 {
    public static void main(String[] args) {
        Samsung s22 = new Samsung("SABB","Galaxy S22", 256);
        iPhone iphone14 = new iPhone("14 Pro", 128);
        Nokia nokia1100 = new Nokia("1100", 32);

        // Common features
        s22.call("9876543210");
        iphone14.sms("9876543210", "Hello from iPhone!");
        nokia1100.call("1234567890");

        // Abstract method implementation
        s22.unlock();
        iphone14.unlock();
        nokia1100.unlock();

        // Interface features
        s22.takePhoto();
        s22.recordVideo();
        s22.playMusic("Shape of You");
        s22.connect5G();

        iphone14.takePhoto();
        iphone14.playMusic("Perfect");
    }
}

