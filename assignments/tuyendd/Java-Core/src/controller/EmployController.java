package controller;

import entities.Employee;
import services.EmployeeService;
import untils.*;

import static entities.Supermarket.*;

public class EmployController {
    public static void addEmployee() {
        int  numberOfEmployees = 0;
        do {
            numberOfEmployees  = Hepler.getIntInput("Nhập số lượng người cần đăng kí ");
        }
        while (
                !CustomerValidator.isValidNumberOfCustomers(numberOfEmployees ));
        for (int i = 0; i < numberOfEmployees; i++) {
              String nameInput = "";
            String addressInput = "";
            int ageInput = 0;
            String genderInput = "";

            String phoneNumberInput = "";
            do {
                nameInput = Hepler.getString("nhập tên nhân viên cần thêm  ");
            }while (
                    nameInput.isEmpty()
            );
            do {
                addressInput = Hepler.getString("nhập địa chỉ nhân viên  ");
            }while (
                    !CustomerValidator.isValidAddress(addressInput)
            );
            do {
                ageInput = Hepler.getIntInput("nhập sô tuổi của nhân viên ");
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
                phoneNumberInput =Hepler.getString("Nhập số điện thoại của bạn ");
            }while (
                    !CustomerValidator.isValidphoneNumber(String.valueOf(phoneNumberInput))

            );
            EmployeeService.addEmployee( nameInput , addressInput ,  ageInput , genderInput , phoneNumberInput );

        }
    }

    public static void deleteEmployee() {
        EmployeeService.printEmployeeList();

        if (EmployeeService.isEmployeeListEmpty()) {
            System.out.println("❌ Không có nhân viên nào trong hệ thống.");
            return;
        }

        boolean result = false;
        String phoneNumber = "";

        do {
            phoneNumber = Hepler.getString("Nhập số điện thoại nhân viên cần xóa: ");
        } while (!EmployeeValidator.checkPhoneNumber(phoneNumber));

        if (EmployeeService.deleteEmployee(phoneNumber)) {
            System.out.println("✅ Nhân viên đã được xóa thành công!");
            EmployeeService.printEmployeeList();
        } else {
            System.out.println("❌ Không tìm thấy nhân viên với số điện thoại: " + phoneNumber);
        }
    }

    public static void PROCESSING_PAYMENTS0_VIA_INVOICES() {
        try {

            if (employees == null || employees.length == 0) {
                System.out.println("Danh sách khách hàng trống. Không thể thực hiện giao dịch.");
                return;
            }
            if (invoices == null || invoices.length == 0) {
                System.out.println("Danh sách hóa đơn trống. Không thể thực hiện giao dịch.");
                return;
            }

            // Chọn khách hàng
            Employee employee = EmployeeService.getEmployeeById(employees);
            System.out.println("Đã chọn khách hàng: " + employee);

            // Chọn hoa don
            System.out.println("Chọn từ danh sách hóa đơn đã có:");
           // Invoice invoice = InvoiceService.getInvoiceById();
           // System.out.println("Đã chọn hóa đơn : " + invoice);

            int quantityInvoiceInput;
            do {
                quantityInvoiceInput = Hepler.getIntInput("Nhập số lượng hóa đơn : ");

            } while (InvoiceValidator.isValidNumberOfInvoice(quantityInvoiceInput));

            System.out.println("Thêm nhân viên sử lý hóa đơn thành công !");

        }
        catch (Exception e) {
            System.out.println("Đã xảy ra lỗi không mong muốn: " + e.getMessage());
        }
        }
    }
