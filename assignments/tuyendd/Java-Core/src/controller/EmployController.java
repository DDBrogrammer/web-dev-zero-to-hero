package controller;

import services.EmployeeService;
import untils.CustomerValidator;
import untils.EmployeeValidator;
import untils.Hepler;

public class EmployController {
    public static void addEmployee() {
        boolean result = false;
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
                phoneNumberInput =Hepler.getString("");
            }while (
                    CustomerValidator.isValidphoneNumber(String.valueOf(phoneNumberInput))

            );
            EmployeeService.addEmployee( nameInput , addressInput ,  ageInput , genderInput , phoneNumberInput );

        }
    }

    public static void deleteEmployee() {
        EmployeeService.printEmployeeList();
        boolean result = false;
        String phoneNumber = "";
        do {
            phoneNumber  = Hepler.getString("nhap so dien thoai");
        } while (
                !EmployeeValidator.isEmployeeExist(phoneNumber )
        );
        if (EmployeeService.deleteEmployee(phoneNumber)) {
            System.out.println("Employee deleted successfully");
            EmployeeService.printEmployeeList();
        }else {
            System.out.println("Something went wrong");
        }
    }
}
