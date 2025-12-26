package practice.cqrs;

public interface ReadModelProjector {
    void onOrderCreated(OrderRecord record);
}
