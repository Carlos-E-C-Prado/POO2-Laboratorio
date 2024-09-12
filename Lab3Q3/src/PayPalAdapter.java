// adapters/PayPalAdapter.java
public class PayPalAdapter implements PaymentProcessor {
    private final PayPalService payPalService;

    public PayPalAdapter() {
        this.payPalService = new PayPalService();
    }

    @Override
    public void processPayment(double amount, String recipient) {
        payPalService.payWithPayPal(amount, recipient);
    }
}
