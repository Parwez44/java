// class Animal{
//     void eat(){
//         System.out.println("This animal eat food");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }


// public class day05 {
//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.eat();
//         d.bark();
//     }
// }




//QN2
// class Student{
//     String name;

//     Student(String name){
//         this.name=name;
//     }
//     void display(){
//         System.out.println("Name is " + this.name);
//     }
// }
// public class day05 {
//     public static void main(String[] args) {
//         Student s=new Student("Parwez");
//         s.display();
//     }
    
// }



// //Ex 3
// class Demo {

//     Demo() {
//         this("Default Constructor"); // Calls parameterized constructor
//     }

//     Demo(String message) {
//         System.out.println(message);
//     }
// }

// public class day05 {
//     public static void main(String[] args) {
//         new Demo();
//     }
// }




//USE of SUPER keyword Eg

import java.util.zip.CRC32;

class parent{
    void display(){
        System.out.println("Parent class method");
    }
}
class child extends parent {
    void display(){
        super.display();
        System.out.println("child class method");
    }
    
}
public class day05 {
    public static void main(String[] args) {
        child c= new child();
        c.display();
    }
    
}
