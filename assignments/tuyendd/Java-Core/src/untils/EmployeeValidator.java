package untils;

import entities.Customer;
import entities.Employee;
import services.EmployeeService;

import java.util.Optional;

public class EmployeeValidator {

    public static boolean isEmployeeExist(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            System.out.println("sai do dai so dien thoai nhan vien");
            return false;
    }
        Optional<Employee> employeeOptional = EmployeeService.getBookByIsnb(phoneNumber);
        if (employeeOptional.isPresent()) {
            System.out.println("ban dang nhan vien: "+ employeeOptional.get());
        }else {
            System.out.println("khong tim nhien vien ");
        }
        return employeeOptional.isPresent();
}
}
