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




    }
}
