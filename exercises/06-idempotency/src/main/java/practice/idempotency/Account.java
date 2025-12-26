package practice.idempotency;

public class Account {
    private final String id;
    private int balanceCents;

    public Account(String id, int balanceCents) {
        this.id = id;
        this.balanceCents = balanceCents;
    }

    public String getId() {
        return id;
    }

    public int getBalanceCents() {
        return balanceCents;
    }

    public void withdraw(int amountCents) {
        this.balanceCents -= amountCents;
    }

    public void deposit(int amountCents) {
        this.balanceCents += amountCents;
    }
}
