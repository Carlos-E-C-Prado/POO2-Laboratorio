public class Main {
    public static void processPayment(PaymentProcessor paymentProcessor, double amount, String recipient) {
        paymentProcessor.processPayment(amount, recipient);
    }

    public static void main(String[] args) {
        // Criando instâncias dos adaptadores
        PaymentProcessor payPalAdapter = new PayPalAdapter();
        PaymentProcessor picpayAdapter = new PicPayAdapter();

        // Processando pagamentos com PayPal
        processPayment(payPalAdapter, 100.0, "customer1@example.com");

        // Processando pagamentos com Stripe
        processPayment(picpayAdapter, 200.0, "customer2@example.com");
    }
}
/*O Adapter é utilizado para criar uma interface comum 
(PaymentProcessor) para diferentes sistemas de pagamento. 
Cada sistema de pagamento (PayPal e PicPay) tem um adaptador 
que traduz as operações da interface comum para as operações 
específicas da API do sistema de pagamento. A função processPayment
realize pagamentos de maneira uniforme,sem precisar conhecer os 
detalhes das implementações específicas de cada sistema de pagamento.*/