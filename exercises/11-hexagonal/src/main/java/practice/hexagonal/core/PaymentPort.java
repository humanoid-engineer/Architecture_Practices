package practice.hexagonal.core;

public interface PaymentPort {
    String charge(String customerId, int amountCents);
}
