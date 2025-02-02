package service;

import entities.Driver;
import entities.Location;
import helpers.AutoId;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import java.util.Objects;
import java.util.Optional;

public class DriverService {
    private static final int MAX_DRIVERS = 100;
    private Driver[] drivers = new Driver[MAX_DRIVERS];
    private int currentSize = 0;

    // Tạo tài khoản tài xế (ID tự động tạo)
    public void createDriverAccount(String name, String username, String password, Double x, Double y) {
        if (Objects.isNull(name) || Objects.isNull(username) || Objects.isNull(password)
                || Objects.isNull(x) || Objects.isNull(y)) {
            throw new IllegalArgumentException("Các tham số không được phép null!");
        }

        if (currentSize >= MAX_DRIVERS) {
            System.out.println("Không thể thêm tài xế. Danh sách đã đầy!");
            return;
        }

        String id = AutoId.generateId();
        Location currentLocation = new Location(x, y);
        drivers[currentSize++] = new Driver(Integer.parseInt(id), name, username, password, currentLocation);
        System.out.println("Tài khoản tài xế đã được tạo: " + name + " với ID: " + id);
    }

    // Tìm tài xế theo ID
    public Optional<Driver> findDriverById(Integer id) {
        if (Objects.isNull(id)) {
            return Optional.empty();
        }

        for (int i = 0; i < currentSize; i++) {
            if (drivers[i].getId()==(id)) {
                return Optional.of(drivers[i]);
            }
        }
        return Optional.empty();
    }

    // Lấy danh sách tất cả tài xế
    public Driver[] getAllDrivers() {
        Driver[] result = new Driver[currentSize];
        System.arraycopy(drivers, 0, result, 0, currentSize);
        return result;
    }
}
