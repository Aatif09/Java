package Oops.Prac;

abstract public class C
{
    int Id;
    void common(){
        System.out.println("Common msg");
    }
    abstract void compulsory();
    public static void main(String[] args) {
        A aa=new A();
        aa.compulsory();
        aa.Id=212;

        B bb=new B();
        bb.compulsory();
        bb.Id=232;



    }
}
