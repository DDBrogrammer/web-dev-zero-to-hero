package service;

import entities.Passenger;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerService {
    private List<Passenger> passengerList = new ArrayList<>();

    // Phương thức tạo tài khoản
    public Passenger createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên hành khách:");
        String name = scanner.nextLine();

        System.out.println("Nhập số điện thoại:");
        String phoneNumber = scanner.nextLine();

        // Tự động tạo ID
        int id = passengerList.size() + 1;

        // Tạo đối tượng Passenger và thêm vào danh sách
        Passenger passenger = new Passenger();
        passengerList.add(passenger);

        System.out.println("Tài khoản đã được tạo thành công!");
        System.out.println("Thông tin tài khoản: " + passenger);

        return passenger;
    }

    // Xem danh sách hành khách
    public void displayPassengers() {
        for (Passenger passenger : passengerList) {
            System.out.println(passenger);
        }
    }
}
