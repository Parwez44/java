// class day03 {
//     String name;
//     int age;
// //Parametrized Constructor
//     day03(String n,int a){
//         name=n;
//         age=a;
//     }

//     //Defualt constructor
// // day03(){
// //         name="doe";
// //         age=18;
// //     }

//     void display(){
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         day03 student1 = new day03("doe",17);
//         student1.display();
//     }
// }





// class day03 {
//     static int count = 0;

//     day03() {
//         count++;
//         System.out.println("Object created: current count: " + count);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         day03 obj1 = new day03();
//         day03 obj2 = new day03();
//         day03 obj3 = new day03();

//         System.out.println("Final count: " + day03.count);
//     }
// }




// class day03{
//     int id;
//     String name;
// }

//     public class Main {    
//     public static void main(String[] args) {
//         day03 s1=new day03();
//         s1.id=101;
//         s1.name="mark";
//         System.out.println(s1.id+s1.name);
//     }
// }



class person{
    String name;
    void display(){
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args){
        person p=new person();
        p.name="john";
        p.display();
    }
}