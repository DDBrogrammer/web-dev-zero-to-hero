package controller;

import constant.Constant;
import entities.Employee;
import services.CustomerService;
import services.ProductService;
import untils.CustomerValidator;
import untils.Hepler;


public class StoreManagement {
       public static void run() {
           boolean isRunMainMenu = true;

           do {
               Hepler.printAppMenu();
               int userChoice = Hepler.getIntInput("Nhập lựa chọn của bạn:", 1, 6);



               switch (userChoice) {
                   case Constant.MainMenuChoice.MANAGE_PRODUCT:
                       boolean isRunProductMenu = true;
                  do {
                       ProductService.printProductList();
                       Hepler.printManageProductMenu();

                       int manageProductChoice = Hepler.getIntInput("nhâp lựa chọn của ban  ", 1, 5);

                       switch (manageProductChoice) {

                           case Constant.ProductMenuChoice.ADD_PRODUCT:
                               ProductController.addProduct();
                               boolean checkContinue_1 =  Hepler.askYesNo();
                               if(checkContinue_1){
                               break;
                           } else{isRunProductMenu=false;}
                           break;

                           case Constant.ProductMenuChoice.SHOW_INFOR_PRODUCT:
                               ProductController.showInformaytionProductbygtin();
                               boolean checkContinue_2 =  Hepler.askYesNo();
                               if(checkContinue_2){
                                   break;
                               }
                               else{isRunProductMenu=false;}
                            break;
                           case Constant.ProductMenuChoice.UPDATE_QUANTITY_PRODUCT:
                               ProductController.updateQuantityProduct();
                               Hepler.askYesNo();
                               boolean checkContinue_3 =  Hepler.askYesNo();
                               if(checkContinue_3){
                                   break;
                               }else{isRunProductMenu=false;}
                               break;

                           case Constant.ProductMenuChoice.DELETE_PRODUCT:
                               ProductController.deleteProduct();
                               boolean checkContinue_4 =  Hepler.askYesNo();
                               if(checkContinue_4){
                                   break;
                               }else{isRunProductMenu=false;}

                               break;
                       }


               }while (isRunProductMenu);

                       break;
                   case Constant.MainMenuChoice.MANAGE_CUSTOMER:
                       boolean isRunCustomerMenu = true;
                       do {
                           Hepler.printManageCustomerMenu();
                           int manageCustomerChoice = Hepler.getIntInput("nhâp lựa chọn của ban  ", 1, 4);
                           switch (manageCustomerChoice) {
                               case Constant.CustomerMenuChoice.REGISTER_CUSTOMER:
                                   CustomerController.registerCustomer();
                                   boolean checkContinue_5 =  Hepler.askYesNo();
                                   if(checkContinue_5){
                                       break;
                                   }
                                   else{isRunCustomerMenu=false;}
                                   break;

                               case Constant.CustomerMenuChoice.UPDATE_SHOPPINGCART_CUSTOMER:

                                   CustomerController.updateShoppingCartCustomer();

                                   boolean checkContinue_6 =  Hepler.askYesNo();
                                   if(checkContinue_6){
                                       break;
                                   }
                                   else{isRunCustomerMenu=false;}
                                   break;
                               case Constant.CustomerMenuChoice.SHOW_INFOR_SHOPPING_CUSTOMER:
                                   CustomerService.printCartList();
                                   break;

                           }
                           break;
                       }while (isRunCustomerMenu);
                   case Constant.MainMenuChoice.MANAGE_EMPLOYEE:
                       Hepler.printManageEmployeeMenu();
                       int manageEmployeeChoice = Hepler.getIntInput("nhập lựa chọn của bạn ", 1, 4);
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
                       int manageInvoice = Hepler.getIntInput("nhập lựa chọn của bạn ", 1, 4);
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
           } while ( isRunMainMenu);
           System.out.println("da thoat truong trinh ");
       }
}
