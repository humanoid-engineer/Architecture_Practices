package practice.eventsourcing;

public class EventSourcingDemo {
    public static void main(String[] args) {
        EventStore store = new EventStore();
        store.append(new OrderCreated("o-1"));
        store.append(new ItemAdded("o-1", "sku-1"));
        store.append(new ItemAdded("o-1", "sku-2"));
        store.append(new OrderShipped("o-1"));

        OrderAggregate aggregate = new OrderAggregate("o-1");
        for (Event event : store.forOrder("o-1")) {
            aggregate.apply(event);
        }

        System.out.println(aggregate.summary());
    }
}
