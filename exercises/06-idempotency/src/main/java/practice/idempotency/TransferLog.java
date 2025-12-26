package practice.idempotency;

import java.util.HashSet;
import java.util.Set;

public class TransferLog {
    private final Set<String> processed = new HashSet<>();

    public boolean isProcessed(String requestId) {
        return processed.contains(requestId);
    }

    public void markProcessed(String requestId) {
        processed.add(requestId);
    }
}
