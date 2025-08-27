package Oops.Polymorphism;

public class AA {
    public static void main(String[] args) {
        System.out.println("A");
        AA aa=new AA();
        aa.main(new int[]{3,4,5});
    }

    public static void main(int[] args) {
        System.out.println("B");
    }

}
