import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    String employeeId;
    String name;
    String role;
    double baseSalary;
    double finalSalary;

    double calculateSalary() {

        switch (role.toLowerCase()) {

            case "manager":
                finalSalary = baseSalary + (baseSalary * 0.20);
                break;

            case "developer":
                finalSalary = baseSalary + (baseSalary * 0.10);
                break;

            case "designer":
                finalSalary = baseSalary + (baseSalary * 0.05);
                break;

            case "intern":
                finalSalary = 1000;
                break;

            default:
                finalSalary = baseSalary;
        }

        return finalSalary;
    }

    void applyDeduction(double amount) {
        finalSalary -= amount;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + finalSalary);
    }
}

class Payroll {

    ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    Employee findEmployeeById(String employeeId) {

        for (Employee e : employees) {
            if (e.employeeId.equals(employeeId)) {
                return e;
            }
        }
        return null;
    }

    void calculateAllSalaries() {

        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        for (Employee e : employees) {
            e.calculateSalary();
            e.displayEmployeeDetails();
        }
    }
}

public class qn5 {

    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("\n1. Add Employee");
                System.out.println("2. Apply Deduction");
                System.out.println("3. Calculate Salaries");
                System.out.println("4. Exit");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        Employee e = new Employee();

                        System.out.print("Enter Employee ID: ");
                        e.employeeId = sc.nextLine();

                        System.out.print("Enter Name: ");
                        e.name = sc.nextLine();

                        System.out.print("Enter Role: ");
                        e.role = sc.nextLine();

                        System.out.print("Enter Base Salary: ");
                        e.baseSalary = sc.nextDouble();
                        sc.nextLine();

                        payroll.addEmployee(e);
                        break;

                    case 2:
                        System.out.print("Enter Employee ID: ");
                        Employee emp = payroll.findEmployeeById(sc.nextLine());

                        if (emp != null) {
                            emp.calculateSalary();
                            System.out.print("Enter Deduction Amount: ");
                            emp.applyDeduction(sc.nextDouble());
                        } else {
                            System.out.println("Employee Not Found.");
                        }
                        break;

                    case 3:
                        payroll.calculateAllSalaries();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 4);
        }
    }
}
