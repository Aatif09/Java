package Lab.Lab1;

public class P2 {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            count++;
            sum += i;
        }
        System.out.println("Total odd numbers: " + count);
        System.out.println("Sum of odd numbers: " + sum);
    }
}

