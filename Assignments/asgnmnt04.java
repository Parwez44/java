class Vehicle {
    int speed = 40;

    Vehicle(int speed) {
        this.speed = speed;   
    }

}

class Car extends Vehicle {
    int speed = 80;
    Car(int speed) {
        super(speed);     
        this.speed = speed;   
    }

    void display() {
        System.out.println("Car speed using this: " + this.speed);
        System.out.println("Vehicle speed using super: " + super.speed);
    }
}

public class asgnmnt04 {
    public static void main(String[] args) {
        Car obj = new Car(100);
        obj.display();
    }
}
