package practice.idempotency;

public class TransferService {
    private final AccountRepository repository;
    private final TransferLog log;

    public TransferService(AccountRepository repository, TransferLog log) {
        this.repository = repository;
        this.log = log;
    }

    public boolean transfer(String requestId, String fromId, String toId, int amountCents) {
        if (log.isProcessed(requestId)) {
            return true;
        }

        Account from = repository.findById(fromId).orElseThrow();
        Account to = repository.findById(toId).orElseThrow();

        from.withdraw(amountCents);
        to.deposit(amountCents);
        repository.save(from);
        repository.save(to);

        log.markProcessed(requestId);
        return true;
    }
}
