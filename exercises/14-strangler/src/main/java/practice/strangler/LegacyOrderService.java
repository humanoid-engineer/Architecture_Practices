package practice.strangler;

public class LegacyOrderService {
    public String getOrder(String orderId) {
        return "LEGACY:" + orderId;
    }
}
