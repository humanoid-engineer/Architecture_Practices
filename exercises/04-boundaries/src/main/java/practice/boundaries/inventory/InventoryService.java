package practice.boundaries.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private final List<ProductEntity> products = new ArrayList<>();

    public InventoryService() {
        products.add(new ProductEntity("p1", "Notebook", 10));
        products.add(new ProductEntity("p2", "Pen", 50));
    }

    public List<ProductDto> listProducts() {
        List<ProductDto> result = new ArrayList<>();
        for (ProductEntity product : products) {
            result.add(new ProductDto(product.getId(), product.getName()));
        }
        return result;
    }
}
