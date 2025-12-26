package practice.cqrs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryOrderReadModel implements ReadModelProjector {
    private final Map<String, String> summaries = new HashMap<>();

    @Override
    public void onOrderCreated(OrderRecord record) {
        String summary = record.getOrderId() + " | " + record.getCustomerId() + " | " + record.getTotalCents();
        summaries.put(record.getOrderId(), summary);
    }

    public String findSummary(String orderId) {
        return summaries.get(orderId);
    }

    public List<String> listSummaries() {
        return new ArrayList<>(summaries.values());
    }
}
