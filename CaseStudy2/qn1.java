abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double processPayment();
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    public double processPayment() {
        return getAmount() * 1.02;
    }
}

class UPIPayment extends Payment {
    public UPIPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    public double processPayment() {
        return getAmount();
    }
}

public class qn1 {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment("TXN1", 1000),
            new UPIPayment("TXN2", 1000)
        };

        double total = 0;
        for (Payment p : payments) {
            total += p.processPayment();
        }

        System.out.println(total);
    }
}