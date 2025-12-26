package practice.cqrs;

import java.util.List;

public class OrderQueryService {
    private final InMemoryOrderReadModel readModel;

    public OrderQueryService(InMemoryOrderReadModel readModel) {
        this.readModel = readModel;
    }

    public String getSummary(String orderId) {
        return readModel.findSummary(orderId);
    }

    public List<String> listSummaries() {
        return readModel.listSummaries();
    }
}
