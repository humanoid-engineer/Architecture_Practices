package practice.circuit;

public class CircuitDemo {
    public static void main(String[] args) throws InterruptedException {
        CircuitBreaker breaker = new CircuitBreaker(2, 1000);
        RemoteService service = new FlakyService();

        for (int i = 0; i < 6; i++) {
            try {
                System.out.println("Call " + i + ": " + breaker.call(service));
            } catch (RuntimeException ex) {
                System.out.println("Call " + i + ": " + ex.getMessage());
            }
            Thread.sleep(200);
        }
    }
}
