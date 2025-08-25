package Oops.AbstractClass;
abstract class Details{
    int id;
    String name;
    String email;
}
class Student extends Details{
}
class Teacher extends Details{
}
class Admin extends Details{
}
class PracticeAC{
    public static void main(String arg[]){
		/*Details d1 = new Details();
		d1.id = 101;
		d1.name = "Vivek";
		d1.email = "vivek@jtcindia.org";*/

        Student s1 = new Student ();
        s1.id = 101;
        s1.name = "Vivek";
        s1.email = "vivek@jtcindia.org";
        System.out.printf("%d %s %s", s1.id, s1.name, s1.email);

    }
}
