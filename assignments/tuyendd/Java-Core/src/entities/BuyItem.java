package entities;

public class BuyItem {
    private Customer idCustomer;
    private Product gtinProduct;
    private int quantity;

    public BuyItem(Product gtinProduct, Customer idCustomer, int quantity) {
        this.gtinProduct = gtinProduct;
        this.idCustomer = idCustomer;
        this.quantity = quantity;
    }


    public Product getGtinProduct() {
        return gtinProduct;
    }

    public void setGtinProduct(Product gtinProduct) {
        this.gtinProduct = gtinProduct;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BuyItem{" +
                "gtinProduct=" + gtinProduct +
                ", idCustomer=" + idCustomer +
                ", quantity=" + quantity +
                '}';
    }
}
