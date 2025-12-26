package practice.boundaries.api;

import practice.boundaries.inventory.InventoryService;

public class InventoryApi {
    public static void main(String[] args) {
        InventoryService service = new InventoryService();
        service.listProducts().forEach(dto ->
            System.out.println(dto.getId() + " | " + dto.getName())
        );
    }
}
