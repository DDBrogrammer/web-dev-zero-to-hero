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
        int numberOfCustomers = 0;

        // Nhập số lượng khách hàng cần đăng ký
        do {
            numberOfCustomers = Hepler.getIntInput("Nhập số lượng người cần đăng ký: ");
        } while (!CustomerValidator.isValidNumberOfCustomers(numberOfCustomers));

        for (int i = 0; i < numberOfCustomers; i++) {
            String nameInput, addressInput, genderInput, phoneNumberInput;
            int ageInput;

            // Nhập tên khách hàng (không được để trống)
            do {
                nameInput = Hepler.getString("Nhập tên khách hàng: ").trim();
            } while (nameInput.isEmpty());

            // Nhập địa chỉ khách hàng (đúng định dạng)
            do {
                addressInput = Hepler.getString("Nhập địa chỉ khách hàng: ").trim();
            } while (!CustomerValidator.isValidAddress(addressInput));

            // Nhập tuổi khách hàng (phải hợp lệ)
            do {
                ageInput = Hepler.getIntInput("Nhập số tuổi của khách hàng: ");
            } while (!CustomerValidator.isValidAge(ageInput));

            // Nhập giới tính (chỉ nhận "Nam" hoặc "Nữ")
            do {
                genderInput = Hepler.getString("Bạn là Nam hay Nữ? ").trim();
            } while (!CustomerValidator.isValidGender(genderInput));

            // Nhập số điện thoại (đúng định dạng)
            do {
                phoneNumberInput = Hepler.getString("Nhập số điện thoại của bạn: ").trim();
            } while (!CustomerValidator.isValidphoneNumber(phoneNumberInput));

            // Đăng ký khách hàng sau khi nhập đủ thông tin hợp lệ
            CustomerService.registerCustomer(nameInput, addressInput, ageInput, genderInput, phoneNumberInput);

            System.out.println("✔ Khách hàng " + nameInput + " đã được đăng ký thành công!");
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

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi không mong muốn: " + e.getMessage());
        }


    }

    public static void deleteCustomer() {

    }
}

























