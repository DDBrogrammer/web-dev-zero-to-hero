package entities;

public class Product {
    private String gtin;
    private static int baseId = 0;   // ID tự tăng
    private int id;                  // ID của từng product
    private String name;
    private int price;
    private int quantity;

    // Generate id tự tăng
    private static int generateId() {
        return ++baseId;
    }

    // Constructor chuẩn
    public Product(String gtin, String name, int price, int quantity) {
        this.gtin = String.valueOf(generateId());
        this.id = id;

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product( String name, int price, int quantity) {
        this.gtin = String.valueOf(generateId());
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getGtin() {
        return gtin;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", gtin='" + gtin + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
