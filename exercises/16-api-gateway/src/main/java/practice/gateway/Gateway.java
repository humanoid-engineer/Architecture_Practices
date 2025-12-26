package practice.gateway;

public class Gateway {
    private final InventoryClient inventory;
    private final BillingClient billing;

    public Gateway(InventoryClient inventory, BillingClient billing) {
        this.inventory = inventory;
        this.billing = billing;
    }

    public OrderSummary getOrderSummary(String sku) {
        int available = inventory.getAvailable(sku);
        int price = billing.getPriceCents(sku);
        return new OrderSummary(sku, price, available);
    }
}
