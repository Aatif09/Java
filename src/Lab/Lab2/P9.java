// 9.	WAP to create a class named Shape and create three subclasses Circle, Triangle and Square,
// each class has two-member functions named draw () and erase ().
// Implement this concept using polymorphism.
package Lab.Lab2;

class Shape {
    public void draw()  { System.out.println("Drawing a generic shape"); }
    public void erase() { System.out.println("Erasing a generic shape"); }
}

class Circle extends Shape {
    @Override public void draw()  { System.out.println("Drawing Circle"); }
    @Override public void erase() { System.out.println("Erasing Circle"); }
}

class Triangle extends Shape {
    @Override public void draw()  { System.out.println("Drawing Triangle"); }
    @Override public void erase() { System.out.println("Erasing Triangle"); }
}

class Square extends Shape {
    @Override public void draw()  { System.out.println("Drawing Square"); }
    @Override public void erase() { System.out.println("Erasing Square"); }
}

class P9 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Triangle(), new Square() };
        for (Shape s : shapes) {
            s.draw();   // polymorphic call
            s.erase();  // polymorphic call
            System.out.println("---");
        }
    }
}

