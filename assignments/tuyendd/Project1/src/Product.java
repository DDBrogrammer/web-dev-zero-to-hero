public class Product {
    private String name;
    private int price;
    private int stockQuantity;
    public Product(String name, int price , int stockQuantity)  {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public static int updateStock(int quantity){          // (Cập nhật số lượng tồn kho)
        return quantity;

    }
    public static int getInfo() {           //   (Hiển thị thông tin sản phẩm).
        return 3;
    }

}
