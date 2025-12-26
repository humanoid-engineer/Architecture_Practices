package practice.saga;

public class SagaDemo {
    public static void main(String[] args) {
        OrderSaga saga = new OrderSaga(
            new InventoryService(),
            new PaymentService(),
            new ShippingService()
        );

        boolean ok = saga.execute("o-1", 3000, true);
        System.out.println("Saga success: " + ok);
    }
}
