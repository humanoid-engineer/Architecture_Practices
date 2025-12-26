package practice.eventsourcing;

public class OrderShipped implements Event {
    private final String orderId;

    public OrderShipped(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }
}
