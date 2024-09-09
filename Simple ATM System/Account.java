public class Account {
    private String accountHolderName;
    private double balance;

    public void createAccount(String name) {
        this.accountHolderName = name;
        this.balance = 0.0;
        System.out.println("Account created for " + name + " with initial balance of $0.00");
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
