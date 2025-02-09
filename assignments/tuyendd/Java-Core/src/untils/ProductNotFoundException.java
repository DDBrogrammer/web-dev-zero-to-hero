package untils;

public class ProductNotFoundException extends Exception{
     public ProductNotFoundException(){
         super("Product not found");
     }
}
