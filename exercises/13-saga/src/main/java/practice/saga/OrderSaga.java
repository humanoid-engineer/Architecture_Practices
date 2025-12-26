package practice.saga;

public class OrderSaga {
    private final InventoryService inventory;
    private final PaymentService payments;
    private final ShippingService shipping;

    public OrderSaga(InventoryService inventory, PaymentService payments, ShippingService shipping) {
        this.inventory = inventory;
        this.payments = payments;
        this.shipping = shipping;
    }

    public boolean execute(String orderId, int amountCents, boolean failShipping) {
        boolean reserved = false;
        boolean charged = false;

        try {
            inventory.reserve(orderId);
            reserved = true;

            payments.charge(orderId, amountCents);
            charged = true;

            if (failShipping) {
                throw new RuntimeException("Shipping provider error");
            }
            shipping.ship(orderId);
            return true;
        } catch (RuntimeException ex) {
            if (charged) {
                payments.refund(orderId, amountCents);
            }
            if (reserved) {
                inventory.release(orderId);
            }
            shipping.cancel(orderId);
            return false;
        }
    }
}
