package entities;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class Invoice {
    private String id;
    private Customer customer;
    private List<Product> productList;
    private double totalAmount;

    public Invoice(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.productList = customer.getShoppingCart();
        this.totalAmount = 0;
    }

    public void calculateTotal() {
        Optional<Double> totalAmount= Optional.of(5.0);
        Double multiplier = 10.0;
        if (totalAmount.isPresent()) {
            Double result = multiplier * totalAmount.get();
            System.out.println(result);
        }



        for (Product item : productList) {
            totalAmount += item.getProduct().getPrice() * item.getQuantity();
        }

    }

    public void printInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Customer: " + customer.getName());
        for (Product item : productList) {
            System.out.println("Product: " + item.getProduct().getName() + ", Quantity: " + item.getQuantity() + ", Subtotal: " + (item.getProduct().getPrice() * item.getQuantity()));
        }
        System.out.println("Total Amount: " + totalAmount);
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
