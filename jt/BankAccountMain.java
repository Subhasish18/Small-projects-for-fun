import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ ₹" + amount + " deposited successfully!");
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn successfully!");
        } else {
            System.out.println("❌ Insufficient balance or invalid amount!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("👤 Account Holder: " + accountHolder);
        System.out.println("🏦 Account Number: " + accountNumber);
        System.out.println("💰 Balance: ₹" + balance);
        System.out.println("------------------------\n");
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ₹");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, bal);
        int choice;

        // Menu loop
        do {
            System.out.println("\n===== BANK ACCOUNT MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    acc.displayAccountInfo();
                    break;

                case 5:
                    System.out.println("👋 Thank you for using our bank system!");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}