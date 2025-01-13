import entities.Driver;
import entities.Passenger;
import service.DriverService;
import service.PassengerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PassengerService passengerService = new PassengerService();
        DriverService driverService = new DriverService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ỨNG DỤNG GỌI XE ===");
            System.out.println("1. Tạo tài khoản hành khách");
            System.out.println("2. Tạo tài khoản tài xế");
            System.out.println("3. Hiển thị danh sách hành khách");
            System.out.println("4. Hiển thị danh sách tài xế");
            System.out.println("5. Tìm hành khách theo ID");
            System.out.println("6. Tìm tài xế theo ID");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên hành khách: ");
                    String passengerName = scanner.nextLine();
                    System.out.print("Nhập số điện thoại hành khách: ");
                    String passengerPhone = scanner.nextLine();
                    try {
                        passengerService.createPassengerAccount(passengerName, passengerPhone);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Nhập tên tài xế: ");
                    String driverName = scanner.nextLine();
                    System.out.print("Nhập tên đăng nhập: ");
                    String driverUsername = scanner.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String driverPassword = scanner.nextLine();
                    System.out.print("Nhập tọa độ X hiện tại: ");
                    Double driverX = scanner.nextDouble();
                    System.out.print("Nhập tọa độ Y hiện tại: ");
                    Double driverY = scanner.nextDouble();
                    scanner.nextLine();
                    try {
                        driverService.createDriverAccount(driverName, driverUsername, driverPassword, driverX, driverY);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;

                case 3:
                    Passenger[] passengers = passengerService.getAllPassengers();
                    if (passengers.length == 0) {
                        System.out.println("Danh sách khách trống.");
                    } else {
                        System.out.println("Danh sách hành khách:");
                        for (Passenger passenger : passengers) {
                            System.out.println("ID: " + passenger.getId() + ", Tên: " + passenger.getName() + ", SĐT: " + passenger.getPhonenumber());
                        }
                    }
                    break;

                case 4:
                    Driver[] drivers = driverService.getAllDrivers();
                    if (drivers.length == 0) {
                        System.out.println("Danh sách tài xế trống.");
                    } else {
                        System.out.println("Danh sách tài xế:");
                        for (Driver driver : drivers) {
                            System.out.println("ID: " + driver.getId() + ", Tên: " + driver.getName() + ", Vị trí: (" + driver.getCurrentLocation().getX() + ", " + driver.getCurrentLocation().getY() + ")");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nhập ID hành khách: ");
                    int passengerId = scanner.nextInt();
                    scanner.nextLine();
                    passengerService.findPassengerById(passengerId).ifPresentOrElse(
                            passenger -> System.out.println("Hành khách: " + passenger.getName() + ", SĐT: " + passenger.getPhonenumber()),
                            () -> System.out.println("Không tìm thấy hành khách.")
                    );
                    break;

                case 6:
                    System.out.print("Nhập ID tài xế: ");
                    int driverId = scanner.nextInt();
                    scanner.nextLine();
                    driverService.findDriverById(driverId).ifPresentOrElse(
                            driver -> System.out.println("Tài xế: " + driver.getName() + ", Vị trí: (" + driver.getCurrentLocation().getX() + ", " + driver.getCurrentLocation().getY() + ")"),
                            () -> System.out.println("Không tìm thấy tài xế.")
                    );
                    break;

                case 7:
                    System.out.println("Thoát ứng dụng. Tạm biệt!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}



