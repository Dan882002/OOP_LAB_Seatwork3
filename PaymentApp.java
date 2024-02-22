package PaymentApp;

public class PaymentApp {
    public static void main(String[] args) {
        Order order = new Order("keyboard", 10, 300.0, new GCash());
        System.out.println("Order item is " + order.getItem() + ".");
        System.out.println("Unit price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());
        System.out.println("\nPayment order details if GCash");
        System.out.println("Discount rate is " + order.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        order.setPaymentMode(new Maya());
        System.out.println("\nPayment order details if Maya");
        System.out.println("Discount rate is " + order.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        order.setPaymentMode(new ShopeePay());
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount rate is " + String.format("%.2f",order.getPaymentMode().determineDiscountRate()));
        System.out.println("Payment amount is " + order.getTotalAmount());



    }
}
