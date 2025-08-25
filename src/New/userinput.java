package New;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        char age = sc.next().charAt(0);
        int first=Character.getNumericValue(age);
        int aa=(int)age;
        System.out.println("Your age is " + first);
        System.out.printf("%s %d %f\n", "Papa", 30, 5000.75);
        System.out.printf("%s %d %f\n", "Mom", 25, 4000.5);

    }
}

// %-10s: Left-align string in 10 spaces
// %5d: Right-align integer in 5 spaces
// %10.2f: Right-align float in 10 spaces, 2 deci