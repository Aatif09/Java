package New;

import java.util.Scanner;

public class MixedInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        // Clear buffer (important after numbers)
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = sc.nextBoolean();
        System.out.println("\n--- Your Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);

        sc.close();
    }
}

