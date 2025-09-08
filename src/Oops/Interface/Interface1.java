package Oops.Interface;


interface I1{
    int a = 10; // public static final int a = 10;
}
class Interface1 implements I1{
public static void main(String[] args){
    System.out.println(I1.a);
    System.out.println(a);
    int a=100;// shadowing
    //I1.a = 1000;
    //error: - cannot assign a value into a final variable
}
}
