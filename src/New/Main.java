package New;
//Class → Constructor → Object Creation → Output
//A constructor is a special method that runs when an object is created.
//It initializes the object.
//It has the same name as the class and no return type.
public class Main {
    // Student class inside the same file
    static class Student {
        int rollNo;
        String name;

        // Default Constructor
        Student() {
            System.out.println("Default constructor called");
            rollNo = 0;
            name = "Unknown";
        }

        // Parameterized Constructor
        Student(int r, String n) {
            System.out.println("Parameterized constructor called");
            rollNo = r;
            name = n;
        }

        // Display method
        void display() {
            System.out.println("Roll No: " + rollNo + ", Name: " + name);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student(101, "Abhi");
        s2.display();

        // Additional examples
        Student s3 = new Student(102, "Ravi");
        Student s4 = new Student(103, "Meera");

        s3.display();
        s4.display();
    }
}

