package practice.boundaries.inventory;

class ProductEntity {
    private final String id;
    private final String name;
    private final int quantity;

    ProductEntity(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    String getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getQuantity() {
        return quantity;
    }
}
