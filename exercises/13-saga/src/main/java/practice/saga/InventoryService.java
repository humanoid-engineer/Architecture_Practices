package practice.saga;

public class InventoryService {
    public void reserve(String orderId) {
        System.out.println("Inventory reserved for " + orderId);
    }

    public void release(String orderId) {
        System.out.println("Inventory released for " + orderId);
    }
}
