package abstractionexamples;

abstract class Payment {
    // Common fields/methods
    double amount;
    
    Payment(double amount) {
        this.amount = amount;
    }
    
    // Abstract method - every payment type must implement
    abstract void processPayment();
    
    // Common behavior
    void generateReceipt() {
        System.out.println("Receipt generated for ₹" + amount);
    }
}

class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }
    
    
    void processPayment() {
        System.out.println("Processing credit card payment of ₹" + amount);
        // ... real logic: call bank API, verify CVV, etc.
    }
}

class UPIPayment extends Payment {
    UPIPayment(double amount) {
        super(amount);
    }
    
    
    void processPayment() {
        System.out.println("Processing UPI payment of ₹" + amount);
        // ... real logic: call PhonePe/GPay API, etc.
    }
}


