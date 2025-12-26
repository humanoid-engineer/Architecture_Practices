package practice.layered.domain;

public class Order {
    private final String id;
    private final int totalCents;

    public Order(String id, int totalCents) {
        this.id = id;
        this.totalCents = totalCents;
    }

    public String getId() {
        return id;
    }

    public int getTotalCents() {
        return totalCents;
    }
}
