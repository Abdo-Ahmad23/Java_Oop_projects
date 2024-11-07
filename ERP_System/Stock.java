import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Stock {
    private int storeId;
    private int productId;
    private int quantity;

    // Constructor
    public Stock(int storeId, int productId, int quantity) {
        this.storeId = storeId;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters and setters
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }


}
