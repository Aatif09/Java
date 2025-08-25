package Oops.Interface;
interface IFC1{
    int a = 10;
}
interface IFC2{
    int a = 20;
}
interface IFC3{
int a = 30;
}
class AAA implements IFC1,IFC2,IFC3{
    void m1(){
        System.out.println("m1 in A class");
        // System.out.println("a :- "+a);
        System.out.println("I1.a :- "+IFC1.a);
        System.out.println("I2.a :- "+IFC2.a);
        System.out.println("I3.a :- "+IFC3.a);
    }
}
class Interface4{
    public static void main(String arg[]){
        AAA a1 = new AAA();
        a1.m1();
    }
}