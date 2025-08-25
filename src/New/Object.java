package New;

public class Object {
    public static void main(String[] args) {
        // Create array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student(101, "Abhi");
        students[1] = new Student(102, "aatif");
        students[2] = new Student(103, "akash");
        // Initialize each student using default constructor
//        for (int i = 0; i < students.length; i++) {
//            students[i] = new Student(); // Constructor called
//        }

        // Display each student's details
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}

