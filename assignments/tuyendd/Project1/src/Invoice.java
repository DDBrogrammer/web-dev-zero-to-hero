public class Invoice {
 private int id;
 private Customer customer;
   Invoice [] productList;
   public Invoice(int id, Customer customer, Invoice [] productList) {
       this.id = id;
       this.customer = customer;
       this.productList = productList;
   }
   public int getId() {
       return id;

   }
   public Customer getCustomer() {
       return customer;
   }

    public void setId(int id) {
        this.id = id;
    }
    public void setCustomer(Customer customer) {
       this.customer = customer;
    }
    public static int calculateTotal(){
       int total = 0;
       return total;
    }
}
