package Oops.Interface;
interface Hello{
//    public void bb();
    default void aa(){
        System.out.println("i am from interface");
    }
}

class Hi implements Hello{
    @Override
    public void aa(){
        System.out.println("i am from Hi");
    }

}
public class MyInterface {
    public static void main(String[] args) {
        Hi hi=new Hi();
        hi.aa();
    }
}

