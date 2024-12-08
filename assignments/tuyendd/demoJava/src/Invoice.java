public class Invoice {
        int id;
        int customer;
        String productList;
        public Invoice(int id, int customer, String productList) {
            this.id = id;
            this.customer = customer;
            this.productList = productList;

        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getCustomer() {
            return customer;
        }
        public void setCustomer(int customer) {
            this.customer = customer;
        }
        public String getProductList() {
            return productList;
        }
       public int calculateTotal(){
         int total = 0;
         return total;
       }
       public int printInvoice(){
            return 0;
       }

}


