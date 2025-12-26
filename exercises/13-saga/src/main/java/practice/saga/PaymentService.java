package practice.saga;

public class PaymentService {
    public void charge(String orderId, int amountCents) {
        System.out.println("Payment charged for " + orderId + ": " + amountCents);
    }

    public void refund(String orderId, int amountCents) {
        System.out.println("Payment refunded for " + orderId + ": " + amountCents);
    }
}
