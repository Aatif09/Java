package Java8;
@FunctionalInterface
public interface Finterface2 {
    public void sayHi();
    default void sayBye(){
        System.out.println("Default");
    };
    static void sayShai(){
        System.out.println("Default");
    };
}
// Java allows you to define only one public class or interface per .java file,
// and the file name must match the public type's name.
//However, you can define another interface in the same file, as long as it's not marked public
// — this is called default-access (also known as package-private).

@FunctionalInterface
interface Finterface3 extends Finterface2{
    default void sayBhai(){
        System.out.println("Default");
    };
}
class FinalInterface  {
    public static void main(String[] args) {
        Finterface3 fi3=()->{
            System.out.println("Woooooow");
        };
        fi3.sayHi();
        fi3.sayBye();
        Finterface2.sayShai();

    }
}
