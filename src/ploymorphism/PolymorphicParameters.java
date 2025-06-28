package ploymorphism;

class Employee {
    private String name;
    private double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    double calculateBonus() {
        return salary * 0.1; // 10% bonus by default
    }
}
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    double calculateBonus() {
        return super.calculateBonus() + 500; // Extra $500 for managers
    }
}
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    @Override
    double calculateBonus() {
        return super.calculateBonus() + 300; // Extra $300 for developers
    }
}
class BonusCalculator {
    static void printBonus(Employee emp) {
        System.out.println("Bonus for " + emp.getClass().getSimpleName() +
                ": $" + emp.calculateBonus());
    }
}
public class PolymorphicParameters {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000);
        Employee emp2 = new Manager("Alice", 80000);
        Employee emp3 = new Developer("Bob", 60000);
        BonusCalculator.printBonus(emp1);
        BonusCalculator.printBonus(emp2);
        BonusCalculator.printBonus(emp3);
    }
}