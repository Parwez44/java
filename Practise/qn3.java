import java.util.*;
abstract class Transport {
    protected String trackingId;
    protected String destination;

    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    public abstract void dispatch();
}

interface GPS {
    String getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId) {
        super(trackingId, "pune");
    }

    public void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    public String getCoordinates() {
        return "40.7128° N";
    }

    public void selfNavigate() {
        System.out.println("Drone navigating");
    }
}

class Truck extends Transport {

    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Truck " + trackingId + " leaving");
    }
}

class CargoShip extends Transport implements GPS {

    public CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Ship " + trackingId + " sailing");
    }

    public String getCoordinates() {
        return "25.2048° N";
    }
}

public class qn3 {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101");
        t.dispatch();

        GPS g = new DeliveryDrone("D101");
        System.out.println(g.getCoordinates());

        if (t instanceof GPS) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        List<Transport> list = new ArrayList<>();
        list.add(new DeliveryDrone("D201"));
        list.add(new Truck("T101", "City"));
        list.add(new CargoShip("S101", "Port"));

        for (Transport tr : list) {
            tr.dispatch();
        }
    }
}