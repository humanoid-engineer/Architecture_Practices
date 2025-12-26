package practice.gateway;

public class OrderSummary {
    private final String sku;
    private final int priceCents;
    private final int available;

    public OrderSummary(String sku, int priceCents, int available) {
        this.sku = sku;
        this.priceCents = priceCents;
        this.available = available;
    }

    @Override
    public String toString() {
        return sku + " | price=" + priceCents + " | available=" + available;
    }
}
