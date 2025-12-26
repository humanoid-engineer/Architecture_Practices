package practice.di;

public class MockProcessor implements PaymentProcessor {
    @Override
    public PaymentResult charge(String customerId, int amountCents) {
        return new PaymentResult(true, "mock_tx");
    }
}
