public class Invoice {
    private int id;
    private Customer customer;
    private Product[] productList;
    private int[] quantities;
    private double totalAmount;

    public Invoice(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.productList = customer.shoppingCart;
        this.quantities = customer.quantities;
        this.totalAmount = 0.0;
    }

    public void calculateTotal() {
        totalAmount = 0.0;
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                totalAmount += productList[i].getPrice() * quantities[i];
            }
        }
    }

    public void printInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Customer: " + customer.getId());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                System.out.println(productList[i].getInfo() + ", Quantity: " + quantities[i]);
            }
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}