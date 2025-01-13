package entities;

public class Invoice {
    private int id;
    private static int baseId;
    private Employee employee;
    private Customer customer;
    private BuyItem[] buyItems;
    private Voucher[] vouchers;
    private String description;
    private double totalAmount;

    public Invoice(String description, int id, double totalAmount) {
        this.description = description;
        this.id = baseId;
        this.totalAmount = totalAmount;
        baseId++;
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
}
