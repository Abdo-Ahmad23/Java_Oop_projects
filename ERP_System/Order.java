import java.util.Date;
import java.util.List;

public class Order implements EntityValidation {
    private int orderId;
    private Customer customer;
    private String orderStatus;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private Store store;
    private Staff staff;
    private List<OrderItem> orderItems;

    // Constructor
    public Order(int orderId, Customer customer, String orderStatus, Date orderDate, Date requiredDate, Date shippedDate,
                 Store store, Staff staff, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.store = store;
        this.staff = staff;
        this.orderItems = orderItems;
    }

    // Getters and setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    // Additional getters and setters...

    @Override
    public boolean isValid() {
        return customer != null && orderDate != null && requiredDate != null;
    }

    @Override
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + (customer != null ? customer.getFirstName() + " " + customer.getLastName() : "N/A"));
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Required Date: " + requiredDate);
        System.out.println("Shipped Date: " + (shippedDate != null ? shippedDate : "Not shipped yet"));
        System.out.println("Store: " + (store != null ? store.getStoreName() : "N/A"));
        System.out.println("Staff: " + (staff != null ? staff.getFirstName() + " " + staff.getLastName() : "N/A"));
    }
}
