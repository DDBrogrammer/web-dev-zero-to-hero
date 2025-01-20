package services;

import entities.*;
import untils.CustomerValidator;
import untils.Hepler;
import untils.ProductValidator;

import java.util.Objects;

public class CustomerService {
    public static boolean registerCustomer(String name, String address, int age, String gender, String phone) {
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
        return result;
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
        Customer customer = new Customer( "","",0,"male", "");
        int idInput = 0;
        do {
            idInput = Hepler.getIntInput("nhap id khach hang");
            if (CustomerValidator.checkCustomerExist(idInput, customers)) {
                break;
            }
        } while (true);

        for (int i = 0; i <= customers.length - 1; i++) {
            if (customers[i] != null) {
                if (customers[i].getId() == (idInput)) {
                    customer.setId(idInput);

                    customer.setPhone(customers[i].getPhone());
                    customer.setName(customers[i].getName());
                    customer.setAddress(customers[i].getAddress());
                    customer.setGender(customers[i].getGender());



                }

            }else {
                break;
            }

        }
        return customer;
    }

    public static void updateShoppingCartCustomer(Customer customer, Product product) {
        boolean result = false;

        for (int i = 0; i < Cart.buyItems.length; i++) {
            if (Cart.buyItems[i] == null) { // Kiểm tra vị trí trống trong giỏ hàng
                // Thêm sản phẩm vào giỏ hàng
                Cart.buyItems[i] = new BuyItem(product, customer, 0);

                Cart.buyItems[i].setQuantity(product.getQuantity());
                System.out.println("Sản phẩm đã được thêm vào giỏ hàng: " + Cart.buyItems[i]);
                result = true;
                break; // Dừng vòng lặp khi thêm thành công
            } else {
                // Hiển thị các sản phẩm đã có trong giỏ hàng
                System.out.println("Sản phẩm trong giỏ hàng: " + Cart.buyItems[i]);
            }
        }

// Thông báo nếu giỏ hàng đã đầy
        if (!result) {
            System.out.println("Giỏ hàng đã đầy. Không thể thêm sản phẩm mới.");
        }
}
}
