package practice.di;

import java.util.UUID;

public class StripeProcessor implements PaymentProcessor {
    @Override
    public PaymentResult charge(String customerId, int amountCents) {
        String tx = "stripe_" + UUID.randomUUID();
        return new PaymentResult(true, tx);
    }
}
