package New;

import java.util.Scanner;

public class Args2 {
    public static void main(String[] args) {
        System.out.println("Started");
        Scanner sc=new Scanner("asa#ada,frer,eeer%fff");
        sc.useDelimiter("[#%]");
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
