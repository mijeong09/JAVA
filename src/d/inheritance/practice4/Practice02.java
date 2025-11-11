package d.inheritance.practice4;

interface Payment {
    void processPayment(int amount);
    String getPaymentMethod();
    default void printReceipt(int amount) {
        System.out.println("영수증" + amount + " - " + getPaymentMethod());
    }
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("신용카드" + cardNumber + " " + amount + "결제 완료");

    }

    @Override
    public String getPaymentMethod() {
        return "신용카드";
    }

    @Override
    public void printReceipt(int amount) {
        Payment.super.printReceipt(amount);
    }
}

class CashPayment implements Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println(" 현금 결제 완료. 금액 : " + amount);
    }

    @Override
    public String getPaymentMethod() {
        return "현금";
    }

    @Override
    public void printReceipt(int amount) {
        Payment.super.printReceipt(amount);
    }
}

public class Practice02 {
    public static void main(String[] args) {
        Payment[] payments = {
                new CreditCardPayment("1234-5678"),
                new CashPayment()
        };

        int amount = 50000;
        for (Payment payment : payments) {
            payment.processPayment(amount);
            payment.printReceipt(amount);
            System.out.println();
        }
    }
}
