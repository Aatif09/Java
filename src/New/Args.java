package New;
import java.util.Arrays;
public class Args {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + ": " + args[i]);
        }
    }
}
