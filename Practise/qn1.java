abstract class payment {
    private String transactionId;
    private double amount;

    public payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double processPayment();
}

class CreditCardPayment extends payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    public double processPayment() {
        double fee = getAmount() * 0.02;
        double finalamount = getAmount() + fee;
        return finalamount;
    }
}

class UPIPayment extends payment {
    private String upiId;

    public UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    public double processPayment() {
        if (upiId != null && upiId.contains("@")) {
            return getAmount();
        }
        return 0;
    }
}

class PaymentProcessor {

    public double process(payment payment) {
        return payment.processPayment();
    }
}

public class qn1 {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        payment p1 = new CreditCardPayment("T1", 1000);
        payment p2 = new UPIPayment("T2", 1000, "user@upi");

        System.out.println(processor.process(p1));
        System.out.println(processor.process(p2));

        payment payments[] = {p1, p2};
        double total = 0;

        for (payment p : payments) {
            total += p.processPayment();
        }

        System.out.println("Total: " + total);
    }
}