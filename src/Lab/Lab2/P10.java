package Lab.Lab2;
class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        // Generic employees have no specific calculation here
        return 0.0;
    }
}

class Manager extends Employee {
    private double basePay;
    private double teamAllowance;
    private double performanceBonus;

    Manager(String name, double basePay, double teamAllowance, double performanceBonus) {
        super(name);
        this.basePay = basePay;
        this.teamAllowance = teamAllowance;
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return basePay + teamAllowance + performanceBonus;
    }
}

class Programmer extends Employee {
    private double basePay;
    private int overtimeHours;
    private double overtimeRate;

    Programmer(String name, double basePay, int overtimeHours, double overtimeRate) {
        super(name);
        this.basePay = basePay;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return basePay + (overtimeHours * overtimeRate);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Asha", 60000, 8000, 12000);
        Programmer p = new Programmer("Ravi", 50000, 10, 800);

        System.out.println("Manager Salary (" + m.name + "): " + m.calculateSalary());
        System.out.println("Programmer Salary (" + p.name + "): " + p.calculateSalary());
    }
}
