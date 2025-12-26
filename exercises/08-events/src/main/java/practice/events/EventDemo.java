package practice.events;

import practice.events.bus.EventBus;
import practice.events.bus.OrderCreatedHandler;
import practice.events.core.OrderCreated;

public class EventDemo {
    public static void main(String[] args) {
        EventBus bus = new EventBus();

        bus.register(new OrderCreatedHandler() {
            @Override
            public void handle(OrderCreated event) {
                System.out.println("Reserve inventory for " + event.getOrderId());
            }
        });

        bus.register(new OrderCreatedHandler() {
            @Override
            public void handle(OrderCreated event) {
                System.out.println("Send email to " + event.getCustomerEmail());
            }
        });

        bus.publish(new OrderCreated("o-1", "ava@example.com"));
    }
}
