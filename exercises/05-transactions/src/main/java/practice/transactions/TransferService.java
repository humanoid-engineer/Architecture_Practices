package practice.transactions;

public class TransferService {
    private final AccountRepository repository;

    public TransferService(AccountRepository repository) {
        this.repository = repository;
    }

    public boolean transfer(String fromId, String toId, int amountCents, boolean failAfterWithdraw) {
        Account from = repository.findById(fromId).orElseThrow();
        Account to = repository.findById(toId).orElseThrow();

        boolean deposited = false;
        try {
            from.withdraw(amountCents);
            if (failAfterWithdraw) {
                throw new RuntimeException("Simulated failure");
            }
            to.deposit(amountCents);
            deposited = true;
            repository.save(from);
            repository.save(to);
            return true;
        } catch (RuntimeException ex) {
            from.deposit(amountCents);
            if (deposited) {
                to.withdraw(amountCents);
            }
            repository.save(from);
            repository.save(to);
            return false;
        }
    }
}
