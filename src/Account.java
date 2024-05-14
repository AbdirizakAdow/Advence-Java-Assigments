public class Account {private int accountNumber;
    private double balance;
    private String dateCreated;
    private String fullName;

    // Constructor
    public Account(int accountNumber, double initialBalance, String fullName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.dateCreated = java.time.LocalDate.now().toString();
        this.fullName = fullName;
    }

    // Deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Check account balance
    public double checkBalance() {
        return balance;
    }

    // Get account details
    public String getAccountDetails() {
        return "Account Number: " + accountNumber +
                "\nFull Name: " + fullName +
                "\nBalance: $" + balance +
                "\nDate Created: " + dateCreated;
    }

}
