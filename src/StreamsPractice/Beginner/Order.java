package StreamsPractice.Beginner;

public class Order {

    private String orderId;
    private String customerId;
    private String orderAmount;

    public Order() {
    }

    public Order(String orderId, String customerId, String orderAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }
}
