package Oops.AbstractClass;
abstract class Person {
    int id;
    String name;
    // Constructor (common logic)
    Person(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Person constructor called");
    }
    abstract void showRole();
}
class Students extends Person {
    Students(int id, String name) {
        super(id, name); // calls Person constructor
    }

    void showRole() {
        System.out.println("Student: " + name);
    }
}
public class ACconstructor {
    public static void main(String[] args) {
        Students s = new Students(101, "Vivek");
        s.showRole();
    }
}


