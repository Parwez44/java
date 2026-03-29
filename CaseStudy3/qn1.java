abstract class Plan {
    private String patientName;
    private double baseFee;

    Plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }

    public String getPatientName() {
        return patientName;
    }

    public double getBaseFee() {
        return baseFee;
    }

    abstract double calculateBill();
}

class SilverPlan extends Plan {

    SilverPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    double calculateBill() {
        return getBaseFee() + 15;
    }
}

class GoldPlan extends Plan {

    GoldPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    double calculateBill() {
        return getBaseFee() + (0.10 * getBaseFee()) - 20;
    }
}

public class qn1 {

    public static void printInvoice(Plan p) {
        System.out.println(p.getPatientName() + " : " + p.calculateBill());
    }

    public static void main(String[] args) {

        Plan p1 = new SilverPlan("John", 100.0);
        Plan p2 = new GoldPlan("Sophia", 200.0);
        Plan p3 = new GoldPlan("Max", 50.0);

        printInvoice(p1);
        printInvoice(p2);
        printInvoice(p3);
    }
}