import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Product implements EntityValidation {
    private int productId;
    private String productName;
    private Brand brand;
    private Category category;
    private int modelYear;
    private double listPrice;

    // Constructor
    public Product(int productId, String productName, Brand brand, Category category, int modelYear, double listPrice) {
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        setModelYear(modelYear);
        setListPrice(listPrice);
    }

    // Getters and setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Brand getBrand() { return brand; }
    public void setBrand(Brand brand) { this.brand = brand; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public int getModelYear() { return modelYear; }
    public void setModelYear(int modelYear) {
        if (modelYear > 1900 && modelYear <= java.time.Year.now().getValue()) {
            this.modelYear = modelYear;
        } else {
            throw new IllegalArgumentException("Invalid model year.");
        }
    }

    public double getListPrice() { return listPrice; }
    public void setListPrice(double listPrice) {
        if (listPrice > 0) {
            this.listPrice = listPrice;
        } else {
            throw new IllegalArgumentException("List price must be positive.");
        }
    }

    @Override
    public boolean isValid() {
        return productName != null && !productName.isEmpty() && listPrice > 0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + (brand != null ? brand.getBrandName() : "N/A"));
        System.out.println("Category: " + (category != null ? category.getCategoryName() : "N/A"));
        System.out.println("Model Year: " + modelYear);
        System.out.println("List Price: $" + listPrice);
    }
}
