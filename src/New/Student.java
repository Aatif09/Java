package New;

public class Student {
    int roll;
    String name;

    // Default constructor
    public Student() {
        System.out.println("Constructor called");
        roll = 0;
        name = "Unknown";
    }
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    // Method to display student details
    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }
}


