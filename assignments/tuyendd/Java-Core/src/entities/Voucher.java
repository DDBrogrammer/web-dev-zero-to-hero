package entities;

public class Voucher {
    private int id;
    private static int baseId;
    private String title;
    private String description;
    private double discountPercentage;
    private String invoiceDate;


    public Voucher(String description, double discountPercentage, int id, String title, String invoiceDate) {
        this.description = description;
        this.discountPercentage = discountPercentage;
        this.id = id;
        this.title = title;
        this.invoiceDate = invoiceDate;
    }

    public static int getBaseId() {
        return baseId;
    }

    public static void setBaseId(int baseId) {
        Voucher.baseId = baseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getInvoiceDate() {
        return invoiceDate;
    }
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}
