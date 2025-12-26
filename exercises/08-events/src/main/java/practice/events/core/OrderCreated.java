package practice.events.core;

public class OrderCreated {
    private final String orderId;
    private final String customerEmail;

    public OrderCreated(String orderId, String customerEmail) {
        this.orderId = orderId;
        this.customerEmail = customerEmail;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
