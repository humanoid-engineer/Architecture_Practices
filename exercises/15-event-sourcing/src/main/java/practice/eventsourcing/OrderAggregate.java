package practice.eventsourcing;

import java.util.ArrayList;
import java.util.List;

public class OrderAggregate {
    private final String orderId;
    private final List<String> items = new ArrayList<>();
    private boolean shipped = false;

    public OrderAggregate(String orderId) {
        this.orderId = orderId;
    }

    public void apply(Event event) {
        if (event instanceof OrderCreated) {
            // no extra state
        } else if (event instanceof ItemAdded) {
            ItemAdded added = (ItemAdded) event;
            items.add(added.getSku());
        } else if (event instanceof OrderShipped) {
            shipped = true;
        }
    }

    public String summary() {
        return orderId + " | items=" + items.size() + " | shipped=" + shipped;
    }
}
