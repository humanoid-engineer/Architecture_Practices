package practice.circuit;

public class CircuitBreaker {
    private final int failureThreshold;
    private final long openMillis;
    private int failures = 0;
    private long openedAt = 0;
    private CircuitState state = CircuitState.CLOSED;

    public CircuitBreaker(int failureThreshold, long openMillis) {
        this.failureThreshold = failureThreshold;
        this.openMillis = openMillis;
    }

    public String call(RemoteService service) {
        if (state == CircuitState.OPEN) {
            if (System.currentTimeMillis() - openedAt < openMillis) {
                throw new RuntimeException("Circuit open");
            }
            state = CircuitState.CLOSED;
            failures = 0;
        }

        try {
            String result = service.fetchData();
            failures = 0;
            return result;
        } catch (RuntimeException ex) {
            failures++;
            if (failures >= failureThreshold) {
                state = CircuitState.OPEN;
                openedAt = System.currentTimeMillis();
            }
            throw ex;
        }
    }
}
