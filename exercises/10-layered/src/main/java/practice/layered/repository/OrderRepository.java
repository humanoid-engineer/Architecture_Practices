package practice.layered.repository;

import java.util.List;
import practice.layered.domain.Order;

public interface OrderRepository {
    void save(Order order);
    List<Order> findAll();
}
