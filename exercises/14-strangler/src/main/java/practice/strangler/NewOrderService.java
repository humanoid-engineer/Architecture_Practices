package practice.strangler;

public class NewOrderService {
    public String getOrder(String orderId) {
        return "NEW:" + orderId;
    }
}
