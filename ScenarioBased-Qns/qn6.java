class Employee {

    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary + (baseSalary * 0.05);
    }
}


class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {

        double employeeSalary = super.calculateSalary();

        return employeeSalary + 2000;
    }
}


class Executive extends Manager {

    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {

        double managerSalary = super.calculateSalary();

        double incentive = baseSalary * 0.10;

        return managerSalary + incentive;
    }
}


public class qn6 {

    public static void main(String[] args) {

        Employee e = new Employee("Alice", 10000);
        System.out.printf("%.2f\n", e.calculateSalary());

        Manager m = new Manager("Bob", 10000);
        System.out.printf("%.2f\n", m.calculateSalary());

        Executive ex = new Executive("Charlie", 10000);
        System.out.printf("%.2f\n", ex.calculateSalary());

    }
}