package PaymentApp;

public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    private PaymentMode paymentMode;
    private double totalAmount;

    public Order(String item, int quantity, double unitPrice, PaymentMode paymentMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.paymentMode = paymentMode;
        totalAmount();
    }

    public void totalAmount() {
        double discountRate = paymentMode.determineDiscountRate();
        double discountedPrice = unitPrice * quantity * discountRate;
        double totalPrice = unitPrice * quantity;
        totalAmount = totalPrice - discountedPrice;
    }

    // Getters and setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
        totalAmount(); // Recalculate total amount when payment mode changes
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
