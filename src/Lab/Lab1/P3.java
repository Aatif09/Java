package Lab.Lab1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
//        int[] arr = {5, 2, 9, 1, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            } if (num > max) {
                max = num;
            }
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
