// //QN:write a program in java where we will be using final class, final method, and final variable within a single program

// import java.util.Scanner;

// final class Bank {

//     final double interestRate = 7.5;

//     final double calculateInterest(double principal, int years) {
//         return (principal * interestRate * years) / 100;
//     }

//     void displayDetails(double principal, int years) {
//         double interest = calculateInterest(principal, years);
//         System.out.println("Principal Amount: " + principal);
//         System.out.println("Years: " + years);
//         System.out.println("Interest Rate: " + interestRate + "%");
//         System.out.println("Interest Amount: " + interest);
//         System.out.println("Total Amount: " + (principal + interest));
//     }
// }
//     public class asgnmnt05 {
//         public static void main(String[] args) {
//              double principal;
//              int years;
//            try(Scanner sc=new Scanner(System.in)){
//             System.out.print("Enter principal amount: ");
//             principal=sc.nextDouble();
//             System.out.print("Enter number of years: ");
//             years=sc.nextInt();
//            };
//             Bank b=new Bank();
//             b.displayDetails(principal, years);
//         }
//     }






// //QN:write a program in java where we will be using the abstract keyword to design a calculator application
// import java.util.Scanner;

// abstract class Calculator {

//     abstract double add(double a, double b);
//     abstract double subtract(double a, double b);
//     abstract double multiply(double a, double b);
//     abstract double divide(double a, double b);
// }

// class BasicCalculator extends Calculator {

//     double add(double a, double b) {
//         return a + b;
//     }

//     double subtract(double a, double b) {
//         return a - b;
//     }

//     double multiply(double a, double b) {
//         return a * b;
//     }

//     double divide(double a, double b) {
//         if (b == 0) {
//             System.out.println("Division by zero not allowed");
//             return 0;
//         }
//         return a / b;
//     }
// }

// public class asgnmnt05 {

//     public static void main(String[] args) {

//         try (Scanner sc = new Scanner(System.in)) {

//             Calculator calc = new BasicCalculator();

//             System.out.print("Enter first number: ");
//             double a = sc.nextDouble();

//             System.out.print("Enter second number: ");
//             double b = sc.nextDouble();

//             System.out.println("Addition: " + calc.add(a, b));
//             System.out.println("Subtraction: " + calc.subtract(a, b));
//             System.out.println("Multiplication: " + calc.multiply(a, b));
//             System.out.println("Division: " + calc.divide(a, b));
//         }
//     }
// }





//QN 3: write a program in java to implement interface to solve the diamond problem
interface A {
    default void show() {
        System.out.println("Message from interface A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("Message from interface B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("Message from interface C");
    }
}

class D implements B, C {

    public void show() {
        System.out.println("Message from class D");

        B.super.show();
        C.super.show();
    }
}

public class asgnmnt05 {

    public static void main(String[] args) {

        D obj = new D();
        obj.show();
    }
}
