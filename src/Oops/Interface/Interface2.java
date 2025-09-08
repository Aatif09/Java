package Oops.Interface;
interface I11{
    int m1();
    void m2();}
abstract class AA implements I11{
    public int m1(){
        System.out.println("m1 in A class");
        return 10;
    }}
class BB extends AA{
    public void m2(){
        System.out.println("m2 in A class");
    }}
class Interface2 {
    public static void main(String arg[]) {
        I11 i1 = new BB();
//        int a = i1.m1();
        i1.m2();
        System.out.println("a : " + i1.m1());
    }}