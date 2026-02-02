//Ex: final variable

// class finalVariableExample{
//     final int max=100;
//     void display(){
//         System.out.println("Max value "+ max);
//     }
// }
// public class day06 {
//     public static void main(String[] args) {
//         finalVariableExample obj=new finalVariableExample();
//         obj.display();
//     }
// }


//Ex: final methods
// class parent{
//     final void display(){
//         System.out.println("Final method in Parent class");
//     }
// }
// class child extends parent{
//     //void display();
// }
// public class day06 {
// public static void main(String[] args) {
//     child c=new child();
//     c.display();
// }
     
// }



// //Eg: Final classes
// final class finalclass{
//     void display(){
//         System.out.println("This is a final class");
//     }
// }
// public class day06 {
//     public static void main(String[] args) {
//         finalclass obj=new finalclass();
//         obj.display();
//     }
    
// }




//Ex: Abstract 
// abstract class Animal {
//     abstract void sound();
//      void eat(){
//         System.out.println("This animal eats food");
//      }
// }
// class dog extends Animal{
//     void sound(){
//         System.out.println("dog barks");
//     }
// }
// public class day06 {

//     public static void main(String[] args) {
//         Animal animal=new dog();
//         animal.sound();
//         animal.eat();
//     }
// }




//Ex: Interface
interface Calling {
    void makeCall(String number);
}

interface Camera {
    void takePhoto();
}

class SmartPhone implements Calling, Camera {

    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    public void takePhoto() {
        System.out.println("Photo clicked");
    }
}

public class day06 {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();
        phone.makeCall("9876543210");
        phone.takePhoto();

        Calling c = new SmartPhone();
        c.makeCall("1234567890");

        Camera cam = new SmartPhone();
        cam.takePhoto();
    }
}
