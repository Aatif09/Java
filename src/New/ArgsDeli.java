package New;
import java.util.Scanner;
public class ArgsDeli {
    public static void main(String[] args) {
//        Scanner sc = new Scanner("apple,banana,grape");
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();

    }
}
