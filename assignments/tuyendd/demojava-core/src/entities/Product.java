package entities;

import java.util.Optional;

public class Product {
    private Product product;
    private double quantity;

    public Product(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product(String productId, String productName, double price, int stock) {
        this.product = new Product(productId, productName, price, stock);
    }

    public Product getProduct() {
        return product;
    }

    public Optional<Double> getQuantity() {
        return Optional.ofNullable(quantity);
    }

    public int getStockQuantity() {
        return product.getStockQuantity();
    }

    public Object getName() {
        return product.getName();
    }

    public Double getPrice() {
        return product.getPrice();
    }

    public void updateStock(int i) {

    }
}
