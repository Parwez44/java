class Account {

    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {

        double interest = balance * 0.04;

        if (balance > 50000) {
            interest = interest + 500;
        }

        return interest;
    }
}

class FixedDeposit extends SavingsAccount {

    FixedDeposit(double balance) {
        super(balance);
    }

    double calculateInterest() {

        double parentInterest = super.calculateInterest();
        double extraInterest = balance * 0.02;

        return parentInterest + extraInterest;
    }
}

class Main1 {

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(10000);
        System.out.println(s1.calculateInterest());

        SavingsAccount s2 = new SavingsAccount(60000);
        System.out.println(s2.calculateInterest());

        FixedDeposit f1 = new FixedDeposit(60000);
        System.out.println(f1.calculateInterest());
    }
}