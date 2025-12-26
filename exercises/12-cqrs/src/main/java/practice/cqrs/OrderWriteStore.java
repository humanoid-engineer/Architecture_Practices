package practice.cqrs;

import java.util.ArrayList;
import java.util.List;

public class OrderWriteStore {
    private final List<OrderRecord> records = new ArrayList<>();

    public void append(OrderRecord record) {
        records.add(record);
    }

    public List<OrderRecord> all() {
        return new ArrayList<>(records);
    }
}
