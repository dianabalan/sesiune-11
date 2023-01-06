package exercises.bank_account;

public class MyBankAccount implements BankAccount {

    private double balance;

    public MyBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void transfer(BankAccount account, double amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        account.deposit(amount);
    }
}