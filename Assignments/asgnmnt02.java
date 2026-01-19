// //1: write a program in java using parameterised constructor to print name ,roll no, and prn of user using scanner sc.
// import java.util.Scanner;

// class Student {
//     String name;
//     int rollNo;
//     long prn;

//     Student(String name, int rollNo, long prn) {
//         this.name = name;
//         this.rollNo = rollNo;
//         this.prn = prn;
//     }

//     void display() {
//         System.out.println("\n Student Details");
//         System.out.println("Name: " + name);
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("PRN: " + prn);
//     }
// }

// public class asgnmnt02 {
//     public static void main(String[] args) {

//         try(Scanner sc=new Scanner(System.in)){
//             System.out.println("Enter your name:");
//             String name=sc.nextLine();
//             System.out.println("Enter you Roll Number:");
//             int roll=sc.nextInt();
//             System.out.println("Enter your PRN:");
//             long PRN =sc.nextLong();
//             Student s=new Student(name,roll,PRN);
//             s.display();

//         }
//     }
        
// }



// //2: write a program in java using parameterised constructor to find the sum, multi, sub, div of two numbers(user will give choice)
// import java.util.Scanner;

// class Calculator {
//     int a, b;

//     Calculator(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     void calculate(int choice) {
//         if (choice == 1)
//             System.out.println("Sum = " + (a + b));
//         else if (choice == 2)
//             System.out.println("Subtraction = " + (a - b));
//         else if (choice == 3)
//             System.out.println("Multiplication = " + (a * b));
//         else if (choice == 4)
//             System.out.println("Division = " + (a / b));
//         else
//             System.out.println("Invalid choice");
//     }
// }

// public class asgnmnt03 {
//     public static void main(String[] args) {

//         try (Scanner sc = new Scanner(System.in)) {

//             System.out.print("Enter first number: ");
//             int x = sc.nextInt();

//             System.out.print("Enter second number: ");
//             int y = sc.nextInt();

//             System.out.println("Enter choice:");
//             System.out.println("1. Sum");
//             System.out.println("2. Subtraction");
//             System.out.println("3. Multiplication");
//             System.out.println("4. Division");

//             int choice = sc.nextInt();

//             Calculator c = new Calculator(x, y);
//             c.calculate(choice);
//         }
//     }
// }









//3: write a program in java using static variable to display a student detail where vcollege name will be coming through static variable
class Student {
    static String college = "Symbiosis Institute of Technology";
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
        System.out.println();
    }
}

public class asgnmnt02 {
    public static void main(String[] args) {

        Student s1 = new Student("Parwez", 12);
        Student s2 = new Student("Ayaan", 15);

        s1.display();
        s2.display();
    }
}
