package exercises.bank_account;

public interface BankAccount {

    void deposit(double amount);

    void withdraw(double amount);

    double checkBalance();

    void transfer(BankAccount account, double amount);
}