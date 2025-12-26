package practice.eventsourcing;

public class OrderCreated implements Event {
    private final String orderId;

    public OrderCreated(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }
}
