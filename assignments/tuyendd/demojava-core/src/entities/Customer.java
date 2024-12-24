package entities;

import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String id;
    private String name;
    private String phoneNumber;
    private List<Product> shoppingCart;

    public Customer(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        if (product.getStockQuantity() >= quantity) {
            shoppingCart.add(new Product(product, quantity));
            product.updateStock(-quantity);
        } else {
            System.out.println("Not enough stock for " + product.getName());
        }
    }

    public void viewCart() {
        for (Product item : shoppingCart) {
            System.out.println("Product: " + item.getProduct().getName() + ", Quantity: " + item.getQuantity() + ", Price: " + (item.getProduct().getPrice() * item.getQuantity()));
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }
}
