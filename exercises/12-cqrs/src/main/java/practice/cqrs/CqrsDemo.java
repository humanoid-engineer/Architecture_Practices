package practice.cqrs;

public class CqrsDemo {
    public static void main(String[] args) {
        OrderWriteStore writeStore = new OrderWriteStore();
        InMemoryOrderReadModel readModel = new InMemoryOrderReadModel();
        OrderCommandService command = new OrderCommandService(writeStore, readModel);
        OrderQueryService query = new OrderQueryService(readModel);

        command.createOrder("o-1", "cust-1", 1500);
        command.createOrder("o-2", "cust-2", 2200);

        query.listSummaries().forEach(System.out::println);
        System.out.println("Lookup o-1: " + query.getSummary("o-1"));
    }
}
