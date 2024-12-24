package service;

import entities.Product;
import helper.Helper;
import helper.ValidateProduct;


public class ProductService {
    private Helper helper=new Helper();
    private ValidateProduct validateProduct=new ValidateProduct();


    public  Product[] getInputListProduct(Product[] productList ){
        int numberOfProduct= helper.getInt("Nhập số lượng san pham : ");
        Product[] newproductList= new Product[numberOfProduct];
        for (int i=0;i<=numberOfProduct-1 ; i++){
            newproductList[i]= getProduct(productList );
        }
        return newproductList;

    }

    public int getTrueProductLength(Product[] productList) {
        int u=0;
        for(int i=0;i<productList.length-1; i++){
            if(productList[i].getId()!=0){
                u++;
            }

        }
        return u;
    }
    public Product getProduct (Product[] productList ){
        String name,price,field ;
        int publishingYear, stockQuantity;
        do {
            name= helper.getString("Nhập tên san pham :");
            if (validateProduct.validateName(name)) {
                break;
            }
        } while (true);


}
}
