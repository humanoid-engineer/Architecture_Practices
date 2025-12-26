package practice.cqrs;

public class OrderRecord {
    private final String orderId;
    private final String customerId;
    private final int totalCents;

    public OrderRecord(String orderId, String customerId, int totalCents) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.totalCents = totalCents;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getTotalCents() {
        return totalCents;
    }
}
