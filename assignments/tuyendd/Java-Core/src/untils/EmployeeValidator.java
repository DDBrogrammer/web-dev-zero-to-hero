package untils;


import entities.Employee;

import java.util.regex.Pattern;


public class EmployeeValidator {



    public static boolean checkEmployeeExist(int idEmployeeInput, Employee[] employees) {
        if (employees == null || employees.length == 0) {
            System.out.println("Danh sách nhân viên trống.");
            return false;
        }

        for (Employee employee : employees) {
            if (employee != null && employee.getId() == idEmployeeInput) {
                System.out.println("Nhân viên tìm thấy: " + employee);
                return true;
            }
        }

        System.out.println("❌ Không tìm thấy nhân viên có ID: " + idEmployeeInput);
        return false;
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            System.out.println("⚠ Số điện thoại không được để trống!");
            return false;
        }

        String regex = "^\\+?[0-9]{10,15}$";
        boolean isValid = Pattern.matches(regex, phoneNumber);

        if (isValid) {
            System.out.println("✔ Số điện thoại hợp lệ: " + phoneNumber);
        } else {
            System.out.println("❌ Số điện thoại không hợp lệ! Số điện thoại phải có từ 10 đến 15 chữ số.");
        }

        return isValid;
    }
}

