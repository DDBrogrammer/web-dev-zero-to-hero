package service;

import entities.Passenger;
import helpers.AutoId;

import java.util.Objects;
import java.util.Optional;

import java.util.Objects;
import java.util.Optional;

public class PassengerService {
    private static final int MAX_PASSENGERS = 100;
    private Passenger[] passengers = new Passenger[MAX_PASSENGERS];
    private int currentSize = 0;

    // Tạo tài khoản hành khách (ID tự động tạo)
    public void createPassengerAccount(String name, String phoneNumber) {
        if (Objects.isNull(name) || Objects.isNull(phoneNumber)) {
            throw new IllegalArgumentException("Các tham số không được phép null!");
        }

        if (currentSize >= MAX_PASSENGERS) {
            System.out.println("Không thể thêm hành khách. Danh sách đã đầy!");
            return;
        }

        String id = AutoId.generateId();
        passengers[currentSize++] = new Passenger(Integer.parseInt(id), name, phoneNumber);
        System.out.println("Tài khoản hành khách đã được tạo: " + name + " với ID: " + id);
    }

    // Tìm hành khách theo ID
    public Optional<Passenger> findPassengerById(Integer id) {
        if (Objects.isNull(id)) {
            return Optional.empty();
        }

        for (int i = 0; i < currentSize; i++) {
            if (passengers[i].getId()==(id)) {
                return Optional.of(passengers[i]);
            }
        }
        return Optional.empty();
    }

    // Lấy danh sách tất cả hành khách
    public Passenger[] getAllPassengers() {
        Passenger[] result = new Passenger[currentSize];
        System.arraycopy(passengers, 0, result, 0, currentSize);
        return result;
    }
}


