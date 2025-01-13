package entities;

public class Product {
    private String gtin;
    private static int baseId =0;;
    private int id;
    public int numberOfProduct;
    private String name ;
    private int price;
    private Voucher[] vouchers;
    private int quantity;


    public Product( String gtin ,String name, int numberOfProduct, int price , int  quantity )  {
        this.id = baseId;
        this.name = name;
        this.price = price;
        this.numberOfProduct = numberOfProduct;
        this.gtin = gtin;
        this.quantity = quantity;
        baseId++;
    }

    public Product(String gtin, String name, int price, int quantity) {
        this.id = baseId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.gtin = gtin;
    }

    ;

    public static int getBaseId() {
        return baseId;
    }



    public String getName() {
        return name;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public String getGtin() {
        return gtin;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }
    public int  getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "gtin='" + gtin + '\'' +
                ", id=" + id +
                ", numberOfProduct=" + numberOfProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}'  ;
    }

}
