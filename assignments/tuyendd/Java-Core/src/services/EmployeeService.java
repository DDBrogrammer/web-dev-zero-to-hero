package services;

import entities.Employee;
import entities.Supermarket;

import java.util.Objects;
import java.util.Optional;

public class EmployeeService {
    public static boolean addEmployee(String name, String address, int age, String gender, String phone) {
        boolean result = false;

        Employee employeer = new Employee(address , age , gender , name,  phone) ;
        for (int i = 0; i < Supermarket.employees.length; i++) {
            if (Objects.isNull(Supermarket.employees[i])) {
                Supermarket.employees[i] = employeer;
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
        for (int i = 0; i < Supermarket.employees.length; i++) {
            if (Objects.nonNull(Supermarket.employees[i])) {
                System.out.println(Supermarket.employees[i]);
            }else {
                break;
            }
        }
    }

    public static Optional<Employee> getBookByIsnb(String phoneNumber) {
        for (int i = 0; i <  Supermarket.employees.length; i++) {
            if (Objects.nonNull(Supermarket.employees[i]) && Supermarket.employees[i].getPhone().equals(phoneNumber)) {
                return Optional.of(Supermarket.employees[i]);
            }
        }
        return Optional.empty();
    }

    public static boolean deleteEmployee(String phoneNumber) {
        boolean result = false;
        // gan 1 co o ngoai
        boolean isDeleted = false;
        for (int i = 0; i < Supermarket.employees.length; i++) {
            if(Objects.nonNull(Supermarket.employees[i])){
                if (Supermarket.employees[i].getPhone().equals(phoneNumber)) {
                    Supermarket.employees[i] = null;
                    isDeleted = true;
                    continue;
                }

                if (isDeleted) {
                    Supermarket.employees[i-1] = Supermarket.employees[i];
                }

            }
        }
        return result;
    }
}
