package Oops.Interface;
interface IF1{
    int a = 10;}
interface IF2{
    int b = 20;
}
interface IF3{
    int c = 30;
}
class AI implements IF1,IF2,IF3{
    void m1(){
        System.out.println("m1 in A class");
        System.out.println("a :- "+a);
        System.out.println("b :- "+b);
        System.out.println("c :- "+c);
    }
}
class Interface3{
    public static void main(String arg[]){
        AI a1 = new AI();
        a1.m1();
    }
}
