package controller;

import entities.Customer;
import entities.Employee;
import entities.Product;
import entities.Supermarket;
import services.CustomerService;
import services.EmployeeService;
import services.InvoiceService;
import services.ProductService;
import untils.*;

import java.util.Objects;

import static entities.Supermarket.*;

public class InvoiceController {

    public static void addInvoice() {

        boolean result = false;

            // kiem tra danh sach khach hang va nhan vien

            if (customers == null || customers.length == 0) {
                System.out.println("Danh sách khách hàng trống. Không thể thực hiện giao dịch.");
                return;
            }

            if (employees == null || employees.length == 0) {
                System.out.println("Danh sách sản phẩm trống. Không thể thực hiện giao dịch.");
                return;
            }
            //chọn khách hàng
            Customer customer = CustomerService.getCustomerbyId(customers);
            System.out.println("Đã chọn khách hàng: " + customer);
            // chọn vân viên
            Employee employee = EmployeeService.getEmployeeById(employees);
            System.out.println("Đã chọn nhân viên " + employee);
            //chọn số lượng vập phẩm
            System.out.println("Chọn từ danh sách sản phẩm đã có:");
            Product product = ProductService.getProductGtin(products);
            System.out.println("Đã chọn sản phẩm: " + product);

            // Nhập số lượng vật phẩm
            int quantityInput;
            do {
                quantityInput = Hepler.getIntInput("Nhập số lượng sản phẩm: ");

            } while (!ProductValidator.isValidProductQuantityBuy(quantityInput, product));
            int totalAmount = 0;
            assert product != null;
            totalAmount += product.getPrice() * quantityInput;
            String descriptionInput = "";
            descriptionInput = Hepler.getString("Nhập mô tả hóa đơn");
            InvoiceService.addInvoice(customer, employee, descriptionInput, quantityInput, totalAmount);





    }
        public static void calculate() {

    }

    public static void print() {
    }

}
