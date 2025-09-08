package Oops.Interface;
interface In1{
    int a = 10;
}
interface In2{
    int b = 20;
}
interface In3 extends In1,In2{
    int c = 30;
}
class A2 implements In3{
    void m1(){
        System.out.println("m1 in A class");
        System.out.println("a :- "+In1.a);
        System.out.println("b :- "+b);
        System.out.println("c :- "+c);
    }
}
class Interface5{
    public static void main(String arg[]){
        A2 a1 = new A2();
        a1.m1();
    }
}
