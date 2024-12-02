public class Employee {
    private String name;
    private int id;
    private double shopingCart ;
    public Employee(String name, int id, double shopingCart) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getShopingCart() {
        return shopingCart;
    }
    public void setShopingCart(double shopingCart) {
        this.shopingCart = shopingCart;
    }
   public String processPayment(Customer customer, Invoice invoice){

        return null;
   }
}
