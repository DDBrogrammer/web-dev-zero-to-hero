package entities;

import static constant.Constant.SystemSize.*;

public class Supermarket {
    public static Employee[] employees=new Employee[EMPLOYEE_SIZE];
    public static Customer[] customers =new Customer[CUSTOMER_SIZE];
    public static Product[] products =new Product[PRODUCT_SIZE];
    public static Invoice[] invoices=new Invoice[INVOICE_SIZE];


    static {
        Customer customer = new Customer( "huy ", "duong lang " , 21, "male" , "4235234");
        Customer customer2 = new Customer( "hinh", "duong lang " , 21, "male" , "4235234");
        Customer customer3 = new Customer( "khoa ", "duong lang " , 21, "famale" , "4235234");
        Customer customer1 = new Customer( "aaa", "duong lang " , 21, "famale" , "4235234");
        Supermarket.customers[0] = customer;
        Supermarket.customers[1] = customer1;
        Supermarket.customers[2] = customer2;
        Supermarket.customers[3] = customer3;
        Supermarket.customers[4] = customer3;

        Product product =new Product("1","laptop",4,8,30);
        Product product1=new Product("2","ti vi",3,6,35);
        Product product3=new Product("3","pc",7,5,40);
        Product product4=new Product("4","chuot",8,7,45);
        Supermarket.products[0]=product;
        Supermarket.products[1]=product1;
        Supermarket.products[2]=product3;
        Supermarket.products[3]=product4;
    }
}
