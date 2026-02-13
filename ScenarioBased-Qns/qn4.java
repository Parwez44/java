import java.util.ArrayList;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {

    String accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        }
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful.");
    }

    void transfer(Account targetAccount, double amount)
            throws InsufficientFundsException {

        if (targetAccount == null) {
            System.out.println("Invalid Target Account.");
            return;
        }

        withdraw(amount);
        targetAccount.deposit(amount);

        System.out.println("Transfer Successful.");
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    void createAccount(String accountNumber,
                       String accountHolderName,
                       double initialBalance) {

        Account acc = new Account();
        acc.accountNumber = accountNumber;
        acc.accountHolderName = accountHolderName;
        acc.balance = initialBalance;

        accounts.add(acc);
        System.out.println("Account Created Successfully.");
    }

    Account getAccount(String accountNumber) {

        for (Account acc : accounts) {
            if (acc.accountNumber.equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        for (Account acc : accounts) {
            acc.displayAccountDetails();
        }
    }
}

public class qn4 {

    public static void main(String[] args) {

        Bank bank = new Bank();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer Money");
                System.out.println("5. Display All Accounts");
                System.out.println("6. Exit");

                choice = sc.nextInt();
                sc.nextLine();

                try {
                    switch (choice) {

                        case 1:
                            System.out.print("Enter Account Number: ");
                            String accNo = sc.nextLine();

                            System.out.print("Enter Holder Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Initial Balance: ");
                            double bal = sc.nextDouble();

                            bank.createAccount(accNo, name, bal);
                            break;

                        case 2:
                            System.out.print("Enter Account Number: ");
                            Account dAcc = bank.getAccount(sc.nextLine());

                            if (dAcc != null) {
                                System.out.print("Enter Amount: ");
                                dAcc.deposit(sc.nextDouble());
                            } else {
                                System.out.println("Account Not Found.");
                            }
                            break;

                        case 3:
                            System.out.print("Enter Account Number: ");
                            Account wAcc = bank.getAccount(sc.nextLine());

                            if (wAcc != null) {
                                System.out.print("Enter Amount: ");
                                wAcc.withdraw(sc.nextDouble());
                            } else {
                                System.out.println("Account Not Found.");
                            }
                            break;

                        case 4:
                            System.out.print("Enter Source Account: ");
                            Account source = bank.getAccount(sc.nextLine());

                            System.out.print("Enter Target Account: ");
                            Account target = bank.getAccount(sc.nextLine());

                            if (source != null && target != null) {
                                System.out.print("Enter Amount: ");
                                source.transfer(target, sc.nextDouble());
                            } else {
                                System.out.println("Invalid Account.");
                            }
                            break;

                        case 5:
                            bank.displayAllAccounts();
                            break;

                        case 6:
                            System.out.println("Exiting...");
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }

            } while (choice != 6);
        }
    }
}
