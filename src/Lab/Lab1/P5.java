package Lab.Lab1;

public class P5 {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum: " + sum);
    }
}

class P6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.valueOf(args[i]);
        }
        System.out.println("Sum: " + sum);
    }
}


