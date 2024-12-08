public class Employee {
    private int id;
    private String name;
    private String role;

    public Employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void processPayment(Customer customer, Invoice invoice) {
        invoice.calculateTotal();
        invoice.printInvoice();
        System.out.println("Payment processed by: " + name);
    }

    public int getId() {
        return id;
    }
}
