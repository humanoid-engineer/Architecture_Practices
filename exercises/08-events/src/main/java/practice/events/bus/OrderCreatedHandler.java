package practice.events.bus;

import practice.events.core.OrderCreated;

public interface OrderCreatedHandler {
    void handle(OrderCreated event);
}
