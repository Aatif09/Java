package New;
// static means belonging to the class, not to objects.
//Shared across all objects of a class.
//Only one copy exists, regardless of how many objects are created.
public class StaticEx {
    int roll;
    String name;
    static String college = "ABC University";  // shared by all students

    StaticEx(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", College: " + college);
    }
}
class Mainn {
    public static void main(String[] args) {
        StaticEx s1 = new StaticEx(101, "Alice");
        StaticEx s2 = new StaticEx(102, "Bob");

        s1.display();
        s2.display();
    }
}
