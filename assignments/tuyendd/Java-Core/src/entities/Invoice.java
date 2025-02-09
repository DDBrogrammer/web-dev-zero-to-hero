package entities;



public class Invoice {
    private int id;
    private static int baseId;
    private final Employee employee;
    private Customer customer;
    private final BuyItem[] buyItems;

    private String description;
    private double totalAmount;

    /*public Invoice(String description, int id, BuyItem[] buyItems, Voucher[] vouchers, double totalAmount) {
        this.description = description;
        this.buyItems = buyItems;
        this.vouchers = vouchers;
        this.id = baseId;
        this.totalAmount = totalAmount;
        baseId++;
    }*/

    public Invoice(BuyItem[] buyItems, Customer customer, String description, Employee employee, double totalAmount) {
        this.buyItems = buyItems;
        this.customer = customer;
        this.description = description;
        this.employee = employee;
        this.totalAmount = totalAmount;

    }


    public static int getBaseId() {
        return baseId;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;

    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "buyItems=" + buyItems +
                ", id=" + id +
                ", employee=" + employee +
                ", customer=" + customer +
                ", description='" + description + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

}
