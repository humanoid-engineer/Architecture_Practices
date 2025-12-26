package practice.events.bus;

import java.util.ArrayList;
import java.util.List;
import practice.events.core.OrderCreated;

public class EventBus {
    private final List<OrderCreatedHandler> orderCreatedHandlers = new ArrayList<>();

    public void register(OrderCreatedHandler handler) {
        orderCreatedHandlers.add(handler);
    }

    public void publish(OrderCreated event) {
        for (OrderCreatedHandler handler : orderCreatedHandlers) {
            handler.handle(event);
        }
    }
}
