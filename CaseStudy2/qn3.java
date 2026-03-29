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

    default void pingServer() {
        System.out.println("Status: Online...");
    }
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    public String getCoordinates() {
        return "40.7128° N";
    }

    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

class Truck extends Transport {
    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Truck " + trackingId + " leaving warehouse...");
    }
}

public class qn3 {
    public static void main(String[] args) {
        Transport[] list = {
            new DeliveryDrone("D101", "City"),
            new Truck("T202", "Town")
        };

        for (Transport t : list) {
            t.dispatch();
            if (t instanceof GPS) {
                GPS g = (GPS) t;
                System.out.println(g.getCoordinates());
                g.pingServer();
            }
        }
    }
}