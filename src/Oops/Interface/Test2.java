package Oops.Interface;
interface Flyable {
    void fly();
}
class Bird {
    void eat() {
        System.out.println("Bird eats");}
}
class Airplane {
    void startEngine() {
        System.out.println("Engine started");
    }}
class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("Sparrow flies in sky");
    }
}
class Jet extends Airplane implements Flyable {
    public void fly() {
        System.out.println("Jet flies at high speed");
    }}
public class Test2 {
    public static void main(String[] args) {
        Flyable f1 = new Sparrow();
        Flyable f2 = new Jet();
        f1.fly();
        f2.fly();
    }
}
