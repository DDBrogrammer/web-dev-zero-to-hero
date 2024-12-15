package service;

import entities.Driver;
import entities.Location;

import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private List<Driver> drivers; // Danh sách tài xế


    public DriverService() {
        this.drivers = new ArrayList<>();
    }

    // Tạo tài khoản tài xế
    public void createDriverAccount(int id, String name, String username, String password, double x, double y) {
        // Kiểm tra xem tên đăng nhập đã tồn tại chưa
        for (Driver driver : drivers) {
            if (driver.getUsername().equalsIgnoreCase(username)) {
                System.out.println("Driver already exists");
                return;
            }
        }
    }

    // Thêm tài xế
    public void addDriver(int id, String name, String password, double x, double y) {
        Location currentLocation  = new Location(x, y);// tạo vị trí từ x, y
        Driver driver = new Driver(id, name, currentLocation);
        drivers.add(driver);
        System.out.println("Driver added" + name);
    }

    // Hiển thị danh sách tài xế
    public void displayDrivers() {
        if (drivers.isEmpty()) {
            System.out.println("Chưa có tài xế nào trong hệ thống");
            return;
        }

        System.out.println("Danh sách tài xế");
        for (Driver driver : drivers) {
            System.out.println("ID: " + driver.getId() + ", Tên: " + driver.getName() +
                    ", Tên đăng nhập: " + driver.getUsername() +
                    ", Vị trí hiện tại: (" + driver.getCurrentLocation().getX() +
                    ", " + driver.getCurrentLocation().getY() + ")");
        }
    }

    // Xác thực tài khoản tài xế
    public boolean authenticateDriver(String username, String password) {
        for (Driver driver : drivers) {
            if (driver.getUsername().equalsIgnoreCase(username) && driver.getPassword().equals(password)) {
                System.out.println("Đăng nhập thành công!" + driver.getName());
                return true;
            }
        }
        System.out.println("Đăng nhập thất bại! Vui lòng kiểm tra tên đăng nhập hoặc mật khẩu.");
        return false;
    }
}
