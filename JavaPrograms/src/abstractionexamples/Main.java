package abstractionexamples;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(1500);
        Payment p2 = new UPIPayment(499);

        p1.processPayment();   // hides all complex credit card logic
        p1.generateReceipt();

        p2.processPayment();   // hides all UPI gateway logic
        p2.generateReceipt();
    }
}
