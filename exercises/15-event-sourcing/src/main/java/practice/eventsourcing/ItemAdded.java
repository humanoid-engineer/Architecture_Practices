package practice.eventsourcing;

public class ItemAdded implements Event {
    private final String orderId;
    private final String sku;

    public ItemAdded(String orderId, String sku) {
        this.orderId = orderId;
        this.sku = sku;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    public String getSku() {
        return sku;
    }
}
