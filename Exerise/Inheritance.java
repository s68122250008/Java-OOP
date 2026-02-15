package Exerise;

// Inheritance practice

//super class
class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Base Salary: " + this.baseSalary);
    }

}

// sub class
class FullTimeEmployee extends Employee {
    double bonus;

    // มี Contructor เริ่มต้นเหมือนแม่
    public FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // เข้าถึง attribute ของแม่ผ่าน super
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return baseSalary + bonus;
    }

}

// sub class
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getTotalSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly rate: " + hourlyRate);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee("Peet", 15000, 3000);
        PartTimeEmployee p1 = new PartTimeEmployee("Kan", 8, 35);

        f1.showInfo();
        System.out.println("Total Salary: " + f1.getTotalSalary());
        p1.showInfo();
        System.out.println("Total Salary: " + p1.getTotalSalary());
    }
}
