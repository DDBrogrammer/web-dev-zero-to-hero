package entities;

public class Product {
  private int  id;
  private  String  name;
  private int price;
  private int stockQuantity;
  public Product(int id, String name, int price, int stockQuantity) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.stockQuantity = stockQuantity;

  }



  public int getId() {
    return id;

  }
  public void setId(int id) {
    this.id = id;

  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;

  }

  public int getStockQuantity() {
    return stockQuantity;
  }
  public void setStockQuantity(int stockQuantity) {
    this.stockQuantity = stockQuantity;
  }
}

