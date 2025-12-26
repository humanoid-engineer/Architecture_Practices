package practice.saga;

public class ShippingService {
    public void ship(String orderId) {
        System.out.println("Order shipped: " + orderId);
    }

    public void cancel(String orderId) {
        System.out.println("Shipping canceled: " + orderId);
    }
}
