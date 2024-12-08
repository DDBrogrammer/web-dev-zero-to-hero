public class Customer {
    int id;
    private String name;
    private int phoneNumber;
    int shoppingCart;
    public Customer(int id, String name, int phoneNumber, int shoppingCart) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.shoppingCart = shoppingCart;
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
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getShoppingCart() {
        return shoppingCart;
    }
    public void setShoppingCart(int shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
   public String addToCart() {
        return "Customer " + id + " has been added to the shopping cart.";
   }
   public String viewCart() {
        return "Customer " + id + " .";
   }
}
