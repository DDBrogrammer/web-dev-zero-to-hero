package controller;

import constant.Constant;
import entities.Employee;
import services.CustomerService;
import services.ProductService;
import untils.CustomerValidator;
import untils.Hepler;


public class StoreManagement {
       public static void run() {
           Hepler.printAppMenu();
           int userChoice = Hepler.getIntInput("Nhập lựa chọn của bạn:",1,6);
            switch (userChoice) {
                case Constant.MainMenuChoice.MANAGE_PRODUCT:
                    ProductService.printProductList();
                    Hepler.printManageProductMenu();
                    int manageProductChoice = Hepler.getIntInput("nhâp lựa chọn của ban  " , 1,5);
                    switch (manageProductChoice) {
                        case Constant.ProductMenuChoice.ADD_PRODUCT:
                            ProductController.addProduct();

                              break;
                        case Constant.ProductMenuChoice.SHOW_INFOR_PRODUCT:
                            ProductController.showInformaytionProductbygtin();
                            break;
                        case Constant.ProductMenuChoice.UPDATE_QUANTITY_PRODUCT:
                            ProductController.updateQuantityProduct();
                            break;
                        case Constant.ProductMenuChoice.DELETE_PRODUCT:
                            ProductController.deleteProduct();
                            break;
                    }
                    break;
                case Constant.MainMenuChoice.MANAGE_CUSTOMER:
                    Hepler.printManageCustomerMenu();
                    int manageCustomerChoice = Hepler.getIntInput("nhâp lựa chọn của ban  " , 1,4);
                    switch (manageCustomerChoice) {
                        case Constant.CustomerMenuChoice.REGISTER_CUSTOMER:
                            CustomerController.registerCustomer();
                            break;
                        case  Constant.CustomerMenuChoice.UPDATE_SHOPPINGCART_CUSTOMER:
                            CustomerService.printCartList();
                            CustomerController.updateShoppingCartCustomer();;

                            break;
                        case Constant.CustomerMenuChoice.SHOW_INFOR_SHOPPING_CUSTOMER:
                          //  CustomerController.showInforShoppingCustomer();
                            break;

                    }
                    break;
                case Constant.MainMenuChoice.MANAGE_EMPLOYEE:
                    Hepler.printManageEmployeeMenu();
                    int manageEmployeeChoice = Hepler.getIntInput( "nhập lựa chọn của bạn ", 1 , 4 );
                    switch (manageEmployeeChoice) {
                        case Constant.EmployeeMenuChoice.ADD_EMPLOYEE:
                            EmployController.addEmployee();

                            break;

                        case Constant.EmployeeMenuChoice.PROCESSING_PAYMENTS0_VIA_INVOICES:



                            break;
                        case Constant.EmployeeMenuChoice.DELETE_EMPLOYEE:
                            EmployController.deleteEmployee();

                    }
                    break;
                case Constant.MainMenuChoice.MANAGE_INVOICE:
                    Hepler.printManageVoiceMenu();
                    int  manageInvoice  = Hepler.getIntInput("nhập lựa chọn của bạn ",1 ,4 );
                    switch (manageInvoice) {
                        case Constant.InvoiceMenuChoice.ADD_INVOICE:
                            InvoiceController.addInvoice();
                            break;

                            case Constant.InvoiceMenuChoice.CALCULATE_TOTAL:
                                InvoiceController.calculate();
                                break;
                        case Constant.InvoiceMenuChoice.PRINT_INVOICE:

                            break;
                    }



            }

       }
}
