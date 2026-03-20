// public class day02 {
//     public static void main(String[] args) {
//         String str = "Java";
//         String rev = "";

//         for (int i = str.length(); i > 0; i--) {
//             rev = rev + str.substring(i - 1, i);
//         }

//         System.out.println(rev);
//     }
// }


// public class day02 {
//     public static void main(String[] args){
//          char firstName[] = {'P', 'a', 'r', 'w', 'e','z'};
//         for (int i = 0; i < firstName.length; i++) {
//             System.out.print(firstName[i]);
//         }
//     }
//     }







//Reversing 
// public class day02 {
//     public static void main(String[] args) {

//         char firstName[] = {'P', 'a', 'r', 'w', 'e', 'z'};
//         char rev[] = new char[firstName.length];

//         int j = 0;

        
//         for (int i = firstName.length - 1; i >= 0; i--) {
//             rev[j] = firstName[i];
//             j++;
//         }
//         for (int i = 0; i < rev.length; i++) {
//             System.out.print(rev[i]);

//         }
//     }
// }






//Reversing STRING 
// public class day02 {
//     public static void main(String[] args) {

//         String firstName = "parwez";
//         char ch[] = firstName.toCharArray();
//         for (int i = ch.length - 1; i >= 0; i--) {
//             System.out.print(ch[i]);
//         }
//     }
// }





//Reversing STRING using only STRING
// public class day02 {
//     public static void main(String[] args) {

//         String name = "parwez";
//         String reversed = "";

//         for (int i = name.length() - 1; i >= 0; i--) {
//             reversed = reversed + name.substring(i, i + 1);
//         }

//         System.out.println(reversed);
//     }
// }





//Reversing STRING using String Builder
public class day02 {
    public static void main(String[] args) {

        String name = "parwez";

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println(reversed);
    }
}
