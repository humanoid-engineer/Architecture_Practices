package practice.di;

public class CheckoutService {
    private final PaymentProcessor processor;

    public CheckoutService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public PaymentResult checkout(String customerId, int amountCents) {
        return processor.charge(customerId, amountCents);
    }
}
