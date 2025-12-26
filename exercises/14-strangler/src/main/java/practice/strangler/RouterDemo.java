package practice.strangler;

public class RouterDemo {
    public static void main(String[] args) {
        OrderRouter router = new OrderRouter(new LegacyOrderService(), new NewOrderService());
        System.out.println(router.getOrder("o-1"));
        System.out.println(router.getOrder("n-2"));
    }
}
