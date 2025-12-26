package practice.layered.ui;

import practice.layered.repository.InMemoryOrderRepository;
import practice.layered.service.OrderService;

public class OrderApi {
    public static void main(String[] args) {
        OrderService service = new OrderService(new InMemoryOrderRepository());
        service.create("o-1", 1200);
        service.create("o-2", 5000);

        service.list().forEach(order ->
            System.out.println(order.getId() + " | " + order.getTotalCents())
        );
    }
}
