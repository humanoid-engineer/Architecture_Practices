package practice.boundaries.inventory;

public class ProductDto {
    private final String id;
    private final String name;

    public ProductDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
