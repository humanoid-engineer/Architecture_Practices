package practice.idempotency;

public class TransferDemo {
    public static void main(String[] args) {
        InMemoryAccountRepository repo = new InMemoryAccountRepository();
        TransferLog log = new TransferLog();
        TransferService service = new TransferService(repo, log);

        String requestId = "req-1";
        service.transfer(requestId, "a1", "a2", 500);
        service.transfer(requestId, "a1", "a2", 500);

        System.out.println("a1: " + repo.findById("a1").orElseThrow().getBalanceCents());
        System.out.println("a2: " + repo.findById("a2").orElseThrow().getBalanceCents());
    }
}
