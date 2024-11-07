import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Store implements EntityValidation {
    private int storeId;
    private String storeName;
    private String phone;
    private String email;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private List<Staff> staffList;

    // Constructor, getters, and setters...

    @Override
    public boolean isValid() {
        return !storeName.isEmpty() && email.contains("@");
    }
    public String getStoreName() {
        return storeName;
    }

    @Override
    public void displayDetails() {
        System.out.println("Store ID: " + storeId + ", Name: " + storeName);
    }
}
