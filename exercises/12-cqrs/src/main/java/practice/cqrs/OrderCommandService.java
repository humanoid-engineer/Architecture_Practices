package practice.cqrs;

public class OrderCommandService {
    private final OrderWriteStore store;
    private final ReadModelProjector projector;

    public OrderCommandService(OrderWriteStore store, ReadModelProjector projector) {
        this.store = store;
        this.projector = projector;
    }

    public void createOrder(String orderId, String customerId, int totalCents) {
        OrderRecord record = new OrderRecord(orderId, customerId, totalCents);
        store.append(record);
        projector.onOrderCreated(record);
    }
}
