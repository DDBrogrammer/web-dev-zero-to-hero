package controller;

import entities.Customer;
import entities.Product;
import services.CustomerService;
import services.ProductService;
import untils.CustomerValidator;
import untils.Hepler;
import untils.ProductNotFoundException;
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
                genderInput = Hepler.getString("bạn là nam hay nữ ");
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
        try {
            // Kiểm tra danh sách khách hàng và sản phẩm
            if (customers == null || customers.length == 0) {
                System.out.println("Danh sách khách hàng trống. Không thể thực hiện giao dịch.");
                return;
            }
            if (products == null || products.length == 0) {
                System.out.println("Danh sách sản phẩm trống. Không thể thực hiện giao dịch.");
                return;
            }

            // Chọn khách hàng
            Customer customer = CustomerService.getCustomerbyId(customers);
            System.out.println("Đã chọn khách hàng: " + customer);

            // Chọn sản phẩm
            System.out.println("Chọn từ danh sách sản phẩm đã có:");
            Product product = ProductService.getProductGtin(products);
            System.out.println("Đã chọn sản phẩm: " + product);

            // Nhập số lượng sản phẩm
            int quantityInput;
            do {
                quantityInput = Hepler.getIntInput("Nhập số lượng sản phẩm: ");

            } while (!ProductValidator.isValidProductQuantityBuy(quantityInput, product));

            // Cập nhật giỏ hàng của khách hàng
            CustomerService.updateShoppingCartCustomer(customer, product, quantityInput);
            System.out.println("Thêm sản phẩm vào giỏ hàng thành công!");
            result = true;

        } catch (ProductNotFoundException productNotFoundException) {
            System.out.println("Lỗi: " + productNotFoundException.getMessage());
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi không mong muốn: " + e.getMessage());
        }

    }

    public static void deleteCustomer() {
    }
}

























