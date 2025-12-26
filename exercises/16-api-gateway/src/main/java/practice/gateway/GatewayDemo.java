package practice.gateway;

public class GatewayDemo {
    public static void main(String[] args) {
        Gateway gateway = new Gateway(new InventoryClient(), new BillingClient());
        System.out.println(gateway.getOrderSummary("sku-1"));
    }
}
