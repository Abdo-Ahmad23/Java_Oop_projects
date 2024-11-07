import java.util.Date;
import java.util.List;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "elhaj", "Heshmat", "01069184910", "heshmat@gmail.com",
                "AliNasser@gmail.com", "Sohag", "12345", "20154");

        Store store = new Store();
        Staff staff = new Staff(1, "Nasser", "Ali", "abdo@gmail.com", "01229902195",
                true, 1, 0);


        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem(1, 1, 101, 2, 20.0, 0.1));  // this item is  1, 2 quantities, $20 each, 10% discount
        orderItems.add(new OrderItem(1, 2, 102, 1, 50.0, 0.2));  // and this is 2, 1 quantity, $50 each, 20% discount


        Date orderDate = new Date();
        Date requiredDate = new Date(orderDate.getTime() + 86400000L); // 1 day after
        Date shippedDate = null; // assuming it's not shipped yet

        // Creating an Order object
        Order order = new Order(1001, customer, "Processing", orderDate, requiredDate, shippedDate, store, staff, orderItems);

        // Testing the isValid method
        if (order.isValid()) {
            System.out.println("Order is valid.");
        } else {
            System.out.println("Order is invalid.");
        }

        // Displaying the order details
        order.displayDetails();
    }
}