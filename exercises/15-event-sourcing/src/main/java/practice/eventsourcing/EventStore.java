package practice.eventsourcing;

import java.util.ArrayList;
import java.util.List;

public class EventStore {
    private final List<Event> events = new ArrayList<>();

    public void append(Event event) {
        events.add(event);
    }

    public List<Event> forOrder(String orderId) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if (event.getOrderId().equals(orderId)) {
                result.add(event);
            }
        }
        return result;
    }
}
