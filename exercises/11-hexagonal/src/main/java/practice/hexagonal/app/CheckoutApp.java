package practice.hexagonal.app;

import practice.hexagonal.adapters.StripeAdapter;
import practice.hexagonal.core.CheckoutUseCase;

public class CheckoutApp {
    public static void main(String[] args) {
        CheckoutUseCase useCase = new CheckoutUseCase(new StripeAdapter());
        String tx = useCase.checkout("cust-1", 2500);
        System.out.println("Transaction: " + tx);
    }
}
