import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Brand implements EntityValidation {
    private int brandId;
    private String brandName;

    // Constructor
    public Brand(int brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    // Getters and setters
    public int getBrandId() { return brandId; }
    public void setBrandId(int brandId) { this.brandId = brandId; }

    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }

    @Override
    public boolean isValid() {
        return brandName != null && !brandName.isEmpty();
    }

    @Override
    public void displayDetails() {
        System.out.println("Brand ID: " + brandId);
        System.out.println("Brand Name: " + brandName);
    }
}
