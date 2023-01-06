package exercises.bank_account;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new MyBankAccount(1000);
        BankAccount account2 = new MyBankAccount(500);
        account1.deposit(100);
        account1.withdraw(200);
        account1.transfer(account2, 300);
        double balance = account1.checkBalance();
        System.out.println("Account 1 balance: " + balance);
        balance = account2.checkBalance();
        System.out.println("Account 2 balance: " + balance);
    }
}