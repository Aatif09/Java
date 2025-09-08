package Oops.Interface;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract double calculateBonus();
    void showDetails() {
        System.out.println(name + " earns " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    double calculateBonus() {
        return salary * 0.2;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Employee e = new Manager("Rajkumar", 50000);
        e.showDetails();
        System.out.println(e.calculateBonus());
    }
}
