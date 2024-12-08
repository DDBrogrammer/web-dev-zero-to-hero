public class Customer {
    int id;
    String name;
    int phoneNumber ;
       String [] shoppingCart;
       public Customer(int id, String name, int phoneNumber, String[] shoppingCart) {
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
       public String[] getShoppingCart() {
           return shoppingCart;
       }
       public void setShoppingCart(String[] shoppingCart) {
           this.shoppingCart = shoppingCart;
       }

        public static int addToCart(Product product, int quantity){
           return quantity+product.getPrice();

        }

        public static int viewCart( Product product) {
           return product.getPrice();
            }

}
