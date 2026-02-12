
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    ArrayList<Double> grades = new ArrayList<>();

    void addGrade(double grade) {
        grades.add(grade);
    }

    double calculateAverage() {

        if (grades.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (double g : grades) {
            sum += g;
        }

        return sum / grades.size();
    }

    void displayStudentDetails() {

        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
    }
}

class GradeManager {

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
    }

    Student findStudentByName(String name) {

        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.displayStudentDetails();
        }
    }
}

public class qn2 {

    public static void main(String[] args) {

        GradeManager manager = new GradeManager();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("1. Add Student");
                System.out.println("2. Add Grade to Student");
                System.out.println("3. Display All Students");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        Student s = new Student();

                        System.out.print("Enter Student Name: ");
                        s.name = sc.nextLine();

                        manager.addStudent(s);
                        System.out.println("Student Added Successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        Student found = manager.findStudentByName(name);

                        if (found != null) {

                            System.out.print("Enter Grade: ");
                            double grade = sc.nextDouble();
                            sc.nextLine();

                            found.addGrade(grade);
                            System.out.println("Grade Added!");
                        } else {
                            System.out.println("Student Not Found.");
                        }
                        break;

                    case 3:
                        manager.displayAllStudents();
                        break;

                    case 4:
                        System.out.println("Exiting Program...");
                        break;

                    default:
                        System.out.println("Invalid Choice.");
                }

            } while (choice != 4);
        }
    }
}
