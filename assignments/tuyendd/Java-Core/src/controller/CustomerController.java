package controller;

import entities.Customer;
import entities.Product;
import services.CustomerService;
import services.ProductService;
import untils.CustomerValidator;
import untils.Hepler;
import untils.ProductValidator;

import static entities.Supermarket.customers;
import static entities.Supermarket.products;

public class CustomerController {
    public static void registerCustomer() {
        boolean result = false;
        int  numberOfCustomers = 0;
        do {
             numberOfCustomers = Hepler.getIntInput("Nhập số lượng người cần đăng kí ");
        }
        while (
                !CustomerValidator.isValidNumberOfCustomers(numberOfCustomers));
        for (int i = 0; i < numberOfCustomers; i++) {
            String nameInput = "";
            String addressInput = "";
            int ageInput = 0;
            String genderInput = "";

            String phoneNumberInput = "";

            do {
                    nameInput = Hepler.getString("nhập tên khách hàng ");
        }while (
                  nameInput.isEmpty()
            );
            do {
                addressInput = Hepler.getString("nhập địa chỉ khách hàng ");
            }while (
                  !CustomerValidator.isValidAddress(addressInput)
            );
            do {
                ageInput = Hepler.getIntInput("nhập sô tuổi của khách hàng ");
            }while (
                  !CustomerValidator.isValidAge(ageInput)
            );
            do {
                genderInput = Hepler.getString("bạn là năm hay nữ ");
            }
            while (
                    !CustomerValidator.isValidGender( genderInput)

            );
            do {
                 phoneNumberInput =Hepler.getString("Nhap so dien thoai cua ban vao day ");
            }while (
                    CustomerValidator.isValidphoneNumber(String.valueOf(phoneNumberInput))

            );
            CustomerService.registerCustomer(nameInput , addressInput , ageInput , genderInput , phoneNumberInput);

        }

    }
    public static void updateShoppingCartCustomer() {
        boolean result = false;
        int  numberOfCustomers = 0;
        int numberOfProduct = 0 ;
        ProductService.printProductList();
        System.out.println("Chọn từ danh sách san pham đã có");
        Product product = ProductService.getProductGtin(products);

        CustomerService.printCustomerList();
        Customer customer = CustomerService.getCustomerbyId(customers);
        System.out.println("Đã chọn sản phẩm: "+product);




        do {
            numberOfCustomers = Hepler.getIntInput("Nhập số lượng khach cần mua đồ  ");
        }
        while (
                !CustomerValidator.isValidNumberOfCustomers(numberOfCustomers));
        for (int i = 0; i < numberOfCustomers; i++) {
                 numberOfProduct = Hepler.getIntInput("Nhap so luong san pham can them ");
             for (int j = 0; j < numberOfProduct; j++) {

                 String idCustomer = "";

                 int numberProductBuy = 0;












               //  CustomerService.updateShoppingCartCustomer( idCustomer,  gtinInput , numberProductBuy);
             }
             }

       }

        }






