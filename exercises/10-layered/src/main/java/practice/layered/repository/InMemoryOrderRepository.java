package practice.layered.repository;

import java.util.ArrayList;
import java.util.List;
import practice.layered.domain.Order;

public class InMemoryOrderRepository implements OrderRepository {
    private final List<Order> store = new ArrayList<>();

    @Override
    public void save(Order order) {
        store.add(order);
    }

    @Override
    public List<Order> findAll() {
        return new ArrayList<>(store);
    }
}
