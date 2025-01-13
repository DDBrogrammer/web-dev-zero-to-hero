package entities;

public class Employee {
    private String id;
    private String name;
    private String role;

    public Employee(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void processPayment(Customer customer, Invoice invoice) {
        invoice.calculateTotal();
        System.out.println("Invoice processed for " + customer.getName() + ". Total amount: " + invoice.getTotalAmount());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
