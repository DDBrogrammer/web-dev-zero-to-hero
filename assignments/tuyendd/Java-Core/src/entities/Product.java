package entities;

public class Product {
    private int gtin;
    private static int baseId;
    public int numberOfProduct;
    private String name ;
    private int price;


    public Product( String name, int price , int numberOfProduct)  {
        this.gtin = baseId;
        this.name = name;
        this.price = price;
        this.numberOfProduct = numberOfProduct;
        baseId++;
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

    public int getGtin() {
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


}
