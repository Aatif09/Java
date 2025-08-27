package Oops.Polymorphism;
class A1{
    void m1(){
        System.out.println("A");
    }
}
class B1 extends A1 {
    //@Override
    void m2(){
        System.out.println("B");
    }
}
public class Dpoly1 {
    public static void main(String[] args) {
    A1 a1=new B1();
    a1.m1();
    }
}
