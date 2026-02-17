package Exerise;

// interface practice

// interface
interface Payment {
    void pay(double amount);
}

class CashPayment implements Payment { // implements
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by cash");
    }
}

class CreditCardPayment implements Payment {
    String cardNumber;

    public CreditCardPayment(String cardNumber) { // constuctor
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // เอาเฉพาะเลข 4 ตัวท้าย
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Paid " + amount + " by credit card (" + last4 + ")");
    }

}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CashPayment();
        Payment p2 = new CreditCardPayment("1234567812341234");
        p1.pay(500.0);
        p2.pay(500.0);
    }
}
