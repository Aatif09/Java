package Oops.AbstractClass;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

abstract class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class MyDog extends Dog {
    public void sleep() {
        System.out.println("MyDog is sleeping");
    }
}

abstract class Cat extends Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

class MyCat extends Cat {}

class AnimalFactory {
    static final int DOG = 1;
    static final int CAT = 2;

    static Animal getAnimal(int type) {
        if (type == DOG) return new MyDog();
        if (type == CAT) return new MyCat();
        return null;
    }
}

public class ACAdvance {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal(1); // MyDog
        Animal a2 = AnimalFactory.getAnimal(2); // MyCat

        a1.eat();    // Dog is eating
        a1.sleep();  // MyDog is sleeping

        a2.eat();    // Cat is eating
        a2.sleep();  // Cat is sleeping
    }
}
/*
Animal a1 = AnimalFactory.getAnimal(1);
↓
Animal a1 = new MyDog();  // via factory
↓
a1.eat();   → calls MyDog's inherited Dog's eat()
a1.sleep(); → calls MyDog's sleep()
*/