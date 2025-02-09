package services;

import entities.*;
import untils.CustomerValidator;
import untils.Hepler;

import java.util.Objects;

public class CustomerService {
    public static void registerCustomer(String name, String address, int age, String gender, String phone) {
        boolean result = false;
        Customer customer = new Customer(name, address, age, gender, phone);
        for (int i = 0; i < Supermarket.customers.length; i++) {
            if (Objects.isNull(Supermarket.customers[i])) {
                Supermarket.customers[i] = customer;
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("them khach hang  moi thanh cong");
            printCustomerList();

        } else {
            System.out.println("them khach hang moi that bai");
        }
    }

    public static void printCustomerList() {
        for (int i = 0; i < Supermarket.customers.length; i++) {
            if (Objects.nonNull(Supermarket.customers[i])) {
                System.out.println(Supermarket.customers[i]);
            } else {
                break;
            }
        }
    }



    public static void printCartList() {
        for (int i = 0; i < Cart.buyItems.length; i++) {
            if (Objects.nonNull(Cart.buyItems[i])) {
                System.out.println(Cart.buyItems[i]);
            } else {
                break;
            }
        }
    }

    public static Customer getCustomerbyId(Customer [ ] customers ) {
        Customer customer = new Customer("", "", 0, "male", "");
        int idInput;
        boolean customerFound = false;

        do {
            idInput = Hepler.getIntInput("Nhập ID khách hàng: ");
            if (CustomerValidator.checkCustomerExist(idInput, customers)) {
                customerFound = true;
                break;
            } else {
                System.out.println("ID khách hàng không tồn tại. Vui lòng nhập lại.");
            }
        } while (true);

        for (Customer existingCustomer : customers) {
            if (existingCustomer != null && existingCustomer.getId() == idInput) {
                customer.setId(existingCustomer.getId());
                customer.setPhone(existingCustomer.getPhone());
                customer.setName(existingCustomer.getName());
                customer.setAddress(existingCustomer.getAddress());
                customer.setGender(existingCustomer.getGender());
                break;
            }
        }
        return customer;
    }

    public static void updateShoppingCartCustomer(Customer customer, Product product , int quantityInput) {
        boolean result = false;

        for (int i = 0; i < Cart.buyItems.length; i++) {
            if (Cart.buyItems[i] == null) {

                Cart.buyItems[i] = new BuyItem(product, customer, 0);

                Cart.buyItems[i].setQuantity(quantityInput);
                System.out.println("Sản phẩm đã được thêm vào giỏ hàng: " + Cart.buyItems[i]);
                result = true;
                break; //
            } else {

                System.out.println("Sản phẩm trong giỏ hàng: " + Cart.buyItems[i]);
            }
        }

//
        if (!result) {
            System.out.println("Giỏ hàng đã đầy. Không thể thêm sản phẩm mới.");
        }
}
}
