package practice.hexagonal.adapters;

import java.util.UUID;
import practice.hexagonal.core.PaymentPort;

public class StripeAdapter implements PaymentPort {
    @Override
    public String charge(String customerId, int amountCents) {
        return "stripe_" + UUID.randomUUID();
    }
}
