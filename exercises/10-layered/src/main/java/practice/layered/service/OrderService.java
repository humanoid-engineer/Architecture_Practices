package practice.layered.service;

import java.util.List;
import practice.layered.domain.Order;
import practice.layered.repository.OrderRepository;

public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order create(String id, int totalCents) {
        Order order = new Order(id, totalCents);
        repository.save(order);
        return order;
    }

    public List<Order> list() {
        return repository.findAll();
    }
}
