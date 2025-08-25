package Oops.AbstractClass;
abstract class Shape {
    int sides;
    Shape(int sidesL) {
        this.sides = sidesL;
    }
    abstract void draw();
    void displaySides() {
        System.out.println("Sides: " + sides);
    }
}
class Triangle extends Shape {
    Triangle() {
        super(3);//super(...) calls the constructor of the superclass.
    }
    void draw() {
        System.out.println("Drawing Triangle");
    }
}
public class ACMain {
    public static void main(String[] args) {

        // Shape s = new Shape(); ❌ Error: Cannot instantiate
        Triangle t = new Triangle();
        t.draw();             // Drawing Triangle
        t.displaySides();     // Sides: 3
    }
}
