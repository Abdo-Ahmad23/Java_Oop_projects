import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Customer implements EntityValidation {
    private int customerId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor
    public Customer(int customerId, String firstName, String lastName, String phone, String email,
                    String street, String city, String state, String zipCode) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        setPhone(phone);
        setEmail(email);
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters and setters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {

        if (!phone.matches("\\d{11}")) {
            throw new IllegalArgumentException("Phone number must contain exactly 11 digits.");
        }
        this.phone = phone;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }


    @Override
    public boolean isValid() {
        return !firstName.isEmpty() && !lastName.isEmpty() && phone.matches("\\d{10}") && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer ID: " + customerId + ", Name: " + firstName + " " + lastName);
    }
}
