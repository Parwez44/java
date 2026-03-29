abstract class Robot {
    private String batteryId;
    protected double chargeLevel;

    Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public void reportStatus() {
        System.out.println(batteryId + " Charge: " + chargeLevel + "%");
    }

    abstract void performTask();
}

class DroneRobot extends Robot {

    DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    void performTask() {
        if (chargeLevel < 15) {
            System.out.println(getBatteryId() + " Low battery!");
        } else {
            chargeLevel -= 15;
            reportStatus();
        }
    }
}

class GroundRobot extends Robot {

    GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    void performTask() {
        if (chargeLevel < 5) {
            System.out.println(getBatteryId() + " Low battery!");
        } else {
            chargeLevel -= 5;
            reportStatus();
        }
    }
}

public class qn2 {
    public static void main(String[] args) {

        Robot[] fleet = new Robot[3];

        fleet[0] = new DroneRobot("D-1", 20.0);
        fleet[1] = new GroundRobot("G-5", 10.0);
        fleet[2] = new DroneRobot("D-2", 10.0);

        for (Robot r : fleet) {
            r.performTask();
        }
    }
}