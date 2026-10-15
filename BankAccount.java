class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountNumber("123456");
        b.setAccountHolder("Amit");
        b.setBalance(5000);

        b.deposit(1000);
        b.withdraw(2000);
        b.withdraw(10000);
        b.deposit(-500);

        System.out.println("Account: " + b.getAccountNumber());
        System.out.println("Holder: " + b.getAccountHolder());
        System.out.println("Balance: " + b.getBalance());
    }
}