package practice.di;

public class CheckoutDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new StripeProcessor();
        CheckoutService service = new CheckoutService(processor);

        PaymentResult result = service.checkout("cust_123", 1999);
        System.out.println("Success: " + result.isSuccess() + ", tx=" + result.getTransactionId());
    }
}
