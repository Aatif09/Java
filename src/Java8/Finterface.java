package Java8;

@FunctionalInterface
interface Greeting {
    void sayHello();
    default void info() {
        System.out.println("Functional Interface with default method.");
    }

    static void description() {
        System.out.println("This is a Calculator Functional Interface.");
    }
}

public class Finterface {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello!");
        g.sayHello();
        Greeting.description();
    }
}

//A functional interface defines the "info" (method signature) of the function.
//A lambda expression provides the implementation of that method.