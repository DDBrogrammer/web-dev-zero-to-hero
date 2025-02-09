package controller;

import constant.Constant;


import services.CustomerService;
import services.ProductService;

import untils.Hepler;
import untils.ProductNotFoundException;


public class StoreManagement {

        public static void run () {
            boolean isRunMainMenu = true;

            while (isRunMainMenu) {

                Hepler.printAppMenu();
                int userChoice = Hepler.getIntInput("Nhập lựa chọn của bạn:", 1, 6);

                switch (userChoice) {
                    case Constant.MainMenuChoice.MANAGE_PRODUCT:
                        manageProductMenu();
                        break;
                    case Constant.MainMenuChoice.MANAGE_CUSTOMER:
                        manageCustomer();
                        break;
                    case Constant.MainMenuChoice.MANAGE_EMPLOYEE:
                        manageEmployee();
                        break;
                    case Constant.MainMenuChoice.MANAGE_INVOICE:
                        manageInvoice();
                        break;
                    case Constant.MainMenuChoice.EXIT:
                        isRunMainMenu = false;
                        System.out.println("Đã thoát chương trình. Tạm biệt!");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        }

    private static void manageInvoice()  {
            boolean isRunInvoiceMenu = true;
            while (isRunInvoiceMenu) {
                Hepler.printManageVoiceMenu();
                int manageInvoiceChoice = Hepler.getIntInput("Nhập lựa chọn của bạn: ", 1, 3);
                switch (manageInvoiceChoice) {
                    case Constant.InvoiceMenuChoice.ADD_INVOICE:
                        InvoiceController.addInvoice();
                        break;
                    case Constant.InvoiceMenuChoice.CALCULATE_TOTAL:
                        InvoiceController.calculate();
                        break;
                    case Constant.InvoiceMenuChoice.PRINT_INVOICE:
                        InvoiceController.print();

                        break;
                     default:
                         System.out.println("Lựa chọn không hợp lệ!");

                }
                isRunInvoiceMenu = Hepler.askYesNo("Bạn có muốn tiếp tục menu quản lý sản phẩm không? (y/n): ");
            }

    }

    private static void manageEmployee() {
            boolean isRunEmployMenu = true;
            while (isRunEmployMenu) {
                Hepler.printManageEmployeeMenu();
                int manageEmployeeChoice = Hepler.getIntInput("Nhập lựa chọn của bạn: ", 1, 5);
                switch (manageEmployeeChoice) {
                    case Constant.EmployeeMenuChoice.ADD_EMPLOYEE:
                        EmployController.addEmployee();
                     break;
                    case Constant.EmployeeMenuChoice.DELETE_EMPLOYEE:
                        EmployController.deleteEmployee();
                        break;
                    case Constant.EmployeeMenuChoice.PROCESSING_PAYMENTS0_VIA_INVOICES:
                        EmployController.PROCESSING_PAYMENTS0_VIA_INVOICES();
                     break;
                     default:
                         System.out.println("Lựa chọn không hợp lệ!");
                }
                isRunEmployMenu  = Hepler.askYesNo("Bạn có muốn tiếp tục menu quản lý sản phẩm không? (y/n): ");
            }
    }

    private static void manageCustomer() {
            boolean isRunCustomerMenu = true;
            while (isRunCustomerMenu) {
                Hepler.printManageCustomerMenu();
                int manageCustomerChoice = Hepler.getIntInput("nhay nhao lua chon cua ban ", 1 , 3);
                switch (manageCustomerChoice) {
                    case Constant.CustomerMenuChoice.REGISTER_CUSTOMER :
                        CustomerController.registerCustomer();
                        break;
                    case Constant.CustomerMenuChoice.DELETE_CUSTOMER:
                        CustomerController.deleteCustomer();
                        break;
                    case Constant.CustomerMenuChoice.UPDATE_SHOPPINGCART_CUSTOMER:
                        CustomerController.updateShoppingCartCustomer();
                        break;
                    case Constant.CustomerMenuChoice.SHOW_INFOR_SHOPPING_CUSTOMER:
                        CustomerService.printCustomerList();
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
                isRunCustomerMenu = Hepler.askYesNo("Bạn có muốn tiếp tục menu quản lý sản phẩm không? (y/n): ");
            }
    }

    private static void manageProductMenu () {
            boolean isRunProductMenu = true;

            while (isRunProductMenu) {
                // Hiển thị danh sách sản phẩm và menu quản lý sản phẩm
                ProductService.printProductList();
                Hepler.printManageProductMenu();

                int manageProductChoice = Hepler.getIntInput("Nhập lựa chọn của bạn: ", 1, 5);

                switch (manageProductChoice) {
                    case Constant.ProductMenuChoice.ADD_PRODUCT:
                        ProductController.addProduct();
                        break;

                    case Constant.ProductMenuChoice.DELETE_PRODUCT:
                        ProductController.deleteProduct();
                        break;

                    case Constant.ProductMenuChoice.SHOW_INFOR_PRODUCT:
                        ProductController.showInformaytionProductbygtin();

                        break;

                    case Constant.ProductMenuChoice.UPDATE_QUANTITY_PRODUCT:
                        ProductController.updateQuantityProduct();
                        break;

                    case Constant.ProductMenuChoice.BACK:
                        isRunProductMenu = false;
                        System.out.println("Quay lại menu chính.");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }

                // Hỏi người dùng có muốn tiếp tục menu quản lý sản phẩm không
                if (isRunProductMenu) {
                    isRunProductMenu = Hepler.askYesNo("Bạn có muốn tiếp tục menu quản lý sản phẩm không? (y/n): ");
                }
            }
        }
    }
