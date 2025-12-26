package practice.transactions;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryAccountRepository implements AccountRepository {
    private final Map<String, Account> store = new HashMap<>();

    public InMemoryAccountRepository() {
        store.put("a1", new Account("a1", 10_000));
        store.put("a2", new Account("a2", 5_000));
    }

    @Override
    public Optional<Account> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void save(Account account) {
        store.put(account.getId(), account);
    }
}
