package practice.strangler;

public class OrderRouter {
    private final LegacyOrderService legacy;
    private final NewOrderService modern;

    public OrderRouter(LegacyOrderService legacy, NewOrderService modern) {
        this.legacy = legacy;
        this.modern = modern;
    }

    public String getOrder(String orderId) {
        if (orderId.startsWith("n-")) {
            return modern.getOrder(orderId);
        }
        return legacy.getOrder(orderId);
    }
}
