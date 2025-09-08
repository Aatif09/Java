package Oops.Interface;
interface I6{
    int a=10;
    void m1();
}
interface I7{
    int a=10;
}
public class Interface6 implements I6,I7 {
    public static void main(String[] args) {
        System.out.println(I6.a);
        int a=200;
        System.out.println(a);
    }

    public void m1(){
        System.out.println("Hello");
    }
}
