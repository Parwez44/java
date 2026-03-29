abstract class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();
}

interface RemoteControllable {
    void connectToWifi();
}

interface PowerSaving {
    String getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving {
    public SmartTV(String brand) {
        super(brand);
    }

    public void turnOn() {
        System.out.println(brand + " TV is booting up...");
    }

    public void connectToWifi() {
        System.out.println("Connecting to Home_5G...");
    }

    public String getEnergyRating() {
        return "5 Star";
    }
}

class ElectricKettle extends Device {
    public ElectricKettle(String brand) {
        super(brand);
    }

    public void turnOn() {
        System.out.println(brand + " Kettle is heating...");
    }
}

public class qn2 {
    public static void main(String[] args) {
        Device d = new SmartTV("Sony");
        d.turnOn();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();
    }
}