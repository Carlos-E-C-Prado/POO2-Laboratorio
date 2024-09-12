public class PicPayAdapter implements PaymentProcessor {
    private final StripeService stripeService;

    public PicPayAdapter() {
        this.stripeService = new StripeService();
    }

    @Override
    public void processPayment(double amount, String recipient) {
        stripeService.charge(amount, recipient);
    }
}
