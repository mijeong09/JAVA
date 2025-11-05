package b.oop.practice;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.print("입급" + amount);
        getBalance();
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.print("출금" + amount);
        getBalance();
    }

    public void getBalance() {
        System.out.println("잔액" + balance);
    }
}
