import entities.Location;
import entities.Passenger;
import entities.Ride;
import service.DriverService;
import service.VehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DriverService driverService = new DriverService();
        VehicleService vehicleService = new VehicleService();
        List<Passenger> passengers = new ArrayList<>();
        List<Ride> rides = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Ứng dụng Gọi Xe ===");
            System.out.println("1. Tạo tài khoản tài xế");
            System.out.println("2. Đăng nhập tài xế");
            System.out.println("3. Thêm phương tiện");
            System.out.println("4. Hiển thị phương tiện của tài xế");
            System.out.println("5. Hiển thị danh sách tài xế");
            System.out.println("6. Tạo tài khoản hành khách");
            System.out.println("7. Đặt chuyến xe");
            System.out.println("8. Gán tài xế cho chuyến xe");
            System.out.println("9. Hiển thị thông tin chuyến xe");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Tạo tài khoản tài xế
                    System.out.print("Nhập ID tài xế: ");
                    int driverId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên tài xế: ");
                    String driverName = scanner.nextLine();
                    System.out.print("Nhập tên đăng nhập: ");
                    String username = scanner.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String password = scanner.nextLine();
                    System.out.print("Nhập tọa độ x hiện tại: ");
                    double x = scanner.nextDouble();
                    System.out.print("Nhập tọa độ y hiện tại: ");
                    double y = scanner.nextDouble();
                    driverService.createDriverAccount(driverId, driverName, username, password, x, y);
                    break;

                case 6:
                    // Tạo tài khoản hành khách
                    System.out.print("Nhập ID hành khách: ");
                    int passengerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên hành khách: ");
                    String passengerName = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    passengers.add(new Passenger(passengerId, passengerName, phoneNumber));
                    System.out.println("Tài khoản hành khách " + passengerName + " đã được tạo.");
                    break;

                case 7:
                    // Đặt chuyến xe
                    System.out.print("Nhập ID hành khách: ");
                    int requesterId = scanner.nextInt();
                    Passenger requester = passengers.stream()
                            .filter(p -> p.getId() == requesterId)
                            .findFirst()
                            .orElse(null);

                    if (requester == null) {
                        System.out.println("Không tìm thấy hành khách!");
                        break;
                    }

                    System.out.print("Nhập tọa độ x điểm đi: ");
                    double fromX = scanner.nextDouble();
                    System.out.print("Nhập tọa độ y điểm đi: ");
                    double fromY = scanner.nextDouble();
                    System.out.print("Nhập tọa độ x điểm đến: ");
                    double toX = scanner.nextDouble();
                    System.out.print("Nhập tọa độ y điểm đến: ");
                    double toY = scanner.nextDouble();

                    Location from = new Location(fromX, fromY);
                    Location to = new Location(toX, toY);
                    Ride ride = requester.requestRide(rides.size() + 1, from, to);
                    rides.add(ride);
                    break;

                case 9:
                    // Hiển thị thông tin chuyến xe
                    System.out.print("Nhập ID chuyến đi: ");
                    int rideId = scanner.nextInt();
                    Ride targetRide = rides.stream()
                            .filter(r -> r.getId() == rideId)
                            .findFirst()
                            .orElse(null);

                    if (targetRide == null) {
                        System.out.println("Không tìm thấy chuyến đi!");
                        break;
                    }
                    targetRide.displayRideDetails();
                    break;

                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
