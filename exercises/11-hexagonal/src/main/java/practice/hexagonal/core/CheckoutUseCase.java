package practice.hexagonal.core;

public class CheckoutUseCase {
    private final PaymentPort payments;

    public CheckoutUseCase(PaymentPort payments) {
        this.payments = payments;
    }

    public String checkout(String customerId, int amountCents) {
        return payments.charge(customerId, amountCents);
    }
}
