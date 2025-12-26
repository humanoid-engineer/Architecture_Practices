package practice.di;

public interface PaymentProcessor {
    PaymentResult charge(String customerId, int amountCents);
}
