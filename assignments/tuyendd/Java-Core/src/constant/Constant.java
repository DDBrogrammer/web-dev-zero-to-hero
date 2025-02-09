package constant;

public interface Constant {


    interface MainMenuChoice {
        int MANAGE_PRODUCT = 1;
        int MANAGE_CUSTOMER = 2;
        int MANAGE_EMPLOYEE = 3;
        int MANAGE_INVOICE = 4;
        int EXIT = 5;
    }
    interface SystemSize{
        int EMPLOYEE_SIZE = 20;
        int PRODUCT_SIZE = 1_000_000;
        int CUSTOMER_SIZE = 100_000;
        int INVOICE_SIZE = 1_0;
        int CUSTOMER_INVOICE_SIZE = 1_000_000;
        int CART_SIZE = 1;
        int VOUCHER_SIZE =1_0 ;
    }
    interface ProductMenuChoice {
        int ADD_PRODUCT = 1;
        int DELETE_PRODUCT = 2;
        int SHOW_INFOR_PRODUCT = 3;
        int UPDATE_QUANTITY_PRODUCT = 4;
        int BACK =5;

        //int  = 3;
    }
    interface CustomerMenuChoice {
           int REGISTER_CUSTOMER = 1;
           int DELETE_CUSTOMER = 2;
           int UPDATE_SHOPPINGCART_CUSTOMER = 3;
           int SHOW_INFOR_SHOPPING_CUSTOMER = 4;
    }
    interface EmployeeMenuChoice {
        int ADD_EMPLOYEE = 1;
        int PROCESSING_PAYMENTS0_VIA_INVOICES= 3;
        int DELETE_EMPLOYEE = 2;


    }
    interface InvoiceMenuChoice {
        int ADD_INVOICE = 1;
        int CALCULATE_TOTAL = 2;
        int PRINT_INVOICE =3;
    }

}
