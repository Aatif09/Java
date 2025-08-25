package Java8;

public class Lambda {
    //Lambda expression is an anonymous function.
    //1. Not having any name
    //2. Not having any return type
    //3. Not having modifier
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("He110 World ! ");
        };
        r.run(); // This works
    }

}
