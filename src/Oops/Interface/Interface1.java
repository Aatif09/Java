package Oops.Interface;


interface I1{
    int a = 10; // public static final int a = 10;
}
class Interface1{
public static void main(String[] args){
    System.out.println(I1.a);
    //I1.a = 1000;
    //error: - cannot assign a value into a final variable
}
}
