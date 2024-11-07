import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Staff implements EntityValidation {
    private int staffId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean active;
    private int storeId;
    private int managerId;

    // Constructor
    public Staff(int staffId, String firstName, String lastName, String email, String phone,
                 boolean active, int storeId, int managerId) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        setEmail(email);
        setPhone(phone);
        this.active = active;
        this.storeId = storeId;
        this.managerId = managerId;
    }

    // Getters and setters
    public int getStaffId() { return staffId; }
    public void setStaffId(int staffId) { this.staffId = staffId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    public void setPhone(String phone) {

        if (!phone.matches("\\d{11}")) {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
        this.phone = phone;
    }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public int getStoreId() { return storeId; }
    public void setStoreId(int storeId) { this.storeId = storeId; }

    public int getManagerId() { return managerId; }
    public void setManagerId(int managerId) { this.managerId = managerId; }

    // Implementation of the interface methods
    @Override
    public boolean isValid() {
        return !firstName.isEmpty() && !lastName.isEmpty() && phone.matches("\\d{10}") && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    @Override
    public void displayDetails() {
        System.out.println("Staff ID: " + staffId + ", Name: " + firstName + " " + lastName);
    }
}
