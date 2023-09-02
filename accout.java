public class Account {
    private double balance;

    // Constructor with initial balance
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Default constructor with balance set to 0
    public Account() {
        balance = 0;
    }

    // Function to add money to the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Function to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            balance -= 5; // Apply penalty of $5 if insufficient balance
            System.out.println("Insufficient balance. A $5 penalty has been charged.");
        } else {
            balance -= amount;
        }
    }

    // Function to inquire the current balance
    public double getBalance() {
        return balance;
    }

    // Function to compute interest on the current balance
    public void computeInterest(double interestRate) {
        double interest = balance * interestRate;
        balance += interest;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an account with an initial balance of $100
        Account account = new Account(100);

        System.out.println(account.inquireBalance());  // Output: 100.0

        account.deposit(50);
        System.out.println(account.inquireBalance());  // Output: 150.0

        account.withdraw(75);
        System.out.println(account.inquireBalance());  // Output: 75.0

        account.withdraw(100);  // Output: Insufficient funds. A $5 penalty will be charged.
        System.out.println(account.inquireBalance());  // Output: 70.0

        account.computeInterest(0.05);  // Compute interest at a rate of 5%
        System.out.println(account.inquireBalance());  // Output: 73.5
    }
}