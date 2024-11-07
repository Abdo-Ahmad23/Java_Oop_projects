import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Category implements EntityValidation {
    private int categoryId;
    private String categoryName;

    // Constructor
    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    // Getters and setters
    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    @Override
    public boolean isValid() {
        return categoryName != null && !categoryName.isEmpty();
    }

    @Override
    public void displayDetails() {
        System.out.println("Category ID: " + categoryId);
        System.out.println("Category Name: " + categoryName);
    }
}
