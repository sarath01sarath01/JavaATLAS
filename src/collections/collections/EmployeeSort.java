package collections.collections;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int id, age, salary;

    public Employee(String name, int id, int age, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSort {



    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aravind", 1001, 20, 25000));
        employeeList.add(new Employee("Bhasker", 1002, 30, 38000));
        employeeList.add(new Employee("Cathy", 1003, 22, 20000));
        employeeList.add(new Employee("Diva", 1004, 28, 40000));

        employeeList.sort((a,b) -> a.salary - b.salary);
        System.out.println("Increasing order of salary");
        employeeList.stream().forEach(System.out::println);

        employeeList.sort((a,b) -> b.salary - a.salary);
        System.out.println("Decreasing order of salary");
        employeeList.stream().forEach(System.out::println);


    }
}
