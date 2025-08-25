package Oops.Interface;
interface A {
    default void sayHello() {
        System.out.println("A says Hello");
    }
}
interface B {
    default void sayHello() {
        System.out.println("B says hello");
    }
}

public class Myclass implements A, B {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.sayHello();
    }
    // Must override sayHello() to resolve conflict
    @Override
    public void sayHello() {
        // You can choose to call either one, or combine them:
        A.super.sayHello();  // or B.super.sayHello();
        B.super.sayHello();
        System.out.println("MyClass resolves the conflict");
    }


}

