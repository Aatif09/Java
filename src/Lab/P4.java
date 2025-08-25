package Lab;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("Total characters: " + length);
        System.out.println("Reversed string: " + rev);

        if (str.equalsIgnoreCase(rev))
            System.out.println("It is a palindrome.");
        else
            System.out.println("Not a palindrome.");
    }
}
