package practice.transactions;

public class TransferDemo {
    public static void main(String[] args) {
        InMemoryAccountRepository repo = new InMemoryAccountRepository();
        TransferService service = new TransferService(repo);

        boolean ok = service.transfer("a1", "a2", 1500, true);
        System.out.println("Transfer success: " + ok);
        System.out.println("a1: " + repo.findById("a1").orElseThrow().getBalanceCents());
        System.out.println("a2: " + repo.findById("a2").orElseThrow().getBalanceCents());
    }
}
