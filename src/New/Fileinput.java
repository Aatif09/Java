package New;
import java.io.File;
import java.util.Scanner;

public class Fileinput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("src/New/input.txt"));

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
