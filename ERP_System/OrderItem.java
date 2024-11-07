import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class OrderItem {
    private int orderId;
    private int itemId;
    private int productId;
    private int quantity;
    private double listPrice;
    private double discount;

    // Constructor
    public OrderItem(int orderId, int itemId, int productId, int quantity, double listPrice, double discount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.productId = productId;
        this.quantity = quantity;
        this.listPrice = listPrice;
        this.discount = discount;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


}
