package practice.bulkhead;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BulkheadDemo {
    public static void main(String[] args) {
        ExecutorService emailPool = Executors.newFixedThreadPool(1);
        ExecutorService billingPool = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 3; i++) {
            int id = i;
            emailPool.submit(() -> {
                sleep(200);
                System.out.println("Email task " + id + " done");
            });
        }

        for (int i = 0; i < 3; i++) {
            int id = i;
            billingPool.submit(() -> {
                sleep(200);
                System.out.println("Billing task " + id + " done");
            });
        }

        emailPool.shutdown();
        billingPool.shutdown();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
