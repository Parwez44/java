// // Use a custom message with chained exception
// public class day09 {

//     public static void main(String[] args) {

//         try {
//             // Code that might throw an exception
//             int[] n = new int[5];
//             int divisor = 0;

//             for (int i = 0; i < n.length; i++) {
//                 int res = n[i] / divisor;   // will cause ArithmeticException
//                 System.out.println(res);
//             }

//         } catch (ArithmeticException e) {

//             // Creating a new exception with the original as the cause
//             throw new RuntimeException("Error: Division by zero occurred", e);
//         }
//     }
// }








// // Superclass without exception declaration
// class SuperClass {
//     void method() {
//         System.out.println("SuperClass method executed");
//     }
// }

// // Subclass declaring an unchecked exception
// class SubClass extends SuperClass {

//     @Override
//     void method() throws ArithmeticException {
//         System.out.println("SubClass method executed");
//         throw new ArithmeticException("Exception in SubClass");
//     }
// }

// // Main class (must match file name)
// public class day09 {

//     public static void main(String[] args) {
//         SuperClass s = new SubClass();

//         try {
//             s.method();
//         } catch (ArithmeticException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }
//     }
// }








//// Checking Method Arguments

// class day09{
//         static String s=null;
//     public static void main(String[] args) {

//         //String s = "";

//         try {
//             System.out.println(getLength(s));
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         }

//         s = "GeeksforGeeks";

//         try {
//             System.out.println(getLength(s));
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         }

//         // Make s null to trigger last message
//         //s = null;

//         try {
//             System.out.println(getLength(s));
//         } catch (IllegalArgumentException e) {
//             // This prints: The argument cannot be null
//             System.out.println(e.getMessage());
//         }
//     }

//     public static int getLength(String s) {

//         if (s == null)
//             throw new IllegalArgumentException("The argument cannot be null");
//         return s.length();
//     }
// }






