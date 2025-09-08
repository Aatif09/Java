package Practice;
class AA{
    private static int x;
     static int z;
    int y;
    void f1(){
        x=10;
        System.out.println(x);
    }
    void f2(){
        y=20;
        System.out.println(y);
    }
        }
public class Prac {
    public static void main(String[] args) {
        System.out.println("Printing from Practice.Main Method");
        System.out.println(AA.z);
        AA a1=new AA();
        a1.f1();
    }
}
