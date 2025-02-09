package services;

import entities.Employee;
import entities.Supermarket;
import untils.EmployeeValidator;
import untils.Hepler;

import java.util.Objects;

import static entities.Supermarket.employees;

public class EmployeeService {
    public static boolean addEmployee(String name, String address, int age, String gender, String phone) {
        boolean result = false;

        Employee employeer = new Employee(address , age , gender , name,  phone) ;
        for (int i = 0; i < employees.length; i++) {
            if (Objects.isNull(employees[i])) {
                employees[i] = employeer;
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("them khach hang  moi thanh cong");
            printEmployeeList();

        }else {
            System.out.println("them khach hang moi that bai");
        }
        return result;
    }
    public static void printEmployeeList() {
        for (int i = 0; i < employees.length; i++) {
            if (Objects.nonNull(employees[i])) {
                System.out.println(employees[i]);
            }else {
                break;
            }
        }
    }



    public static boolean deleteEmployee(String phoneNumber) {
        boolean result = false;
        // gan 1 co o ngoai
        boolean isDeleted = false;
        for (int i = 0; i < employees.length; i++) {
            if(Objects.nonNull(employees[i])){
                if (employees[i].getPhone().equals(phoneNumber)) {
                    employees[i] = null;
                    isDeleted = true;
                    continue;
                }

                if (isDeleted) {
                    employees[i-1] = employees[i];
                }

            }
        }
        return result;
    }

    public static Employee getEmployeeById(Employee[] employees) {
        Employee employee = new Employee("", 0, "", "", ""); // Khởi tạo đối tượng Employee rỗng
        int idEmployeeInput;
        boolean employeeFound = false;

        // Kiểm tra ID nhân viên tồn tại
        do {
            idEmployeeInput = Hepler.getIntInput("Nhập ID nhân viên: ");
            if (EmployeeValidator.checkEmployeeExist(idEmployeeInput, Supermarket.employees)) {
                employeeFound = true;
                break;
            } else {
                System.out.println("❌ ID nhân viên không tồn tại. Vui lòng nhập lại.");
            }
        } while (!employeeFound);

        // Tìm nhân viên theo ID
        for (Employee existingEmployee : Supermarket.employees) {
            if (existingEmployee != null && existingEmployee.getId() == idEmployeeInput) {
                // Gán thông tin nhân viên tìm thấy vào biến `employee`
                employee.setId(existingEmployee.getId());
                employee.setPhone(existingEmployee.getPhone());
                employee.setName(existingEmployee.getName());
                employee.setAddress(existingEmployee.getAddress());
                employee.setGender(existingEmployee.getGender());
                break;
            }
        }

        return employee; // Trả về nhân viên đã tìm thấy
    }

    public static boolean isEmployeeListEmpty() {
        if (Objects.isNull(employees)) {
            return true;
        }
        return employees.length == 0;
    }
}
