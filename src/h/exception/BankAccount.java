package h.exception;

class InsufficientBalanceException extends Exception {
    private int current;
    private int requst;

    public InsufficientBalanceException(int current, int requst) {
        super("잔액 부족" + current + " / " + requst);
        this.current = current;
        this.requst = requst;
    }
}


public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException{
        if (balance < amount) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(10000);

        try {
            ba.withdraw(100000);
        } catch (InsufficientBalanceException e) {
            System.out.println("problem");
        }
        System.out.println(ba.balance);
    }
}
