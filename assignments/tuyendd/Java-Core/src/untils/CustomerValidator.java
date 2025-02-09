package untils;

import entities.Cart;
import entities.Customer;
import entities.Supermarket;

import java.util.Objects;
import java.util.regex.Pattern;

public class CustomerValidator {
    public static boolean isValidNumberOfCustomers(int numberOfCustomers) {
        boolean isValid = false;
        if (numberOfCustomers<=0) {
            System.out.println("so luong dau sach phai lon hon 0");
            return isValid;
        }else {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isValidAddress(String address) {
        String addressRegex = "^[a-zA-Z0-9\\s,.-]+$";
        return Pattern.matches(addressRegex, address);
    }

    public static boolean isValidAge(int age) {
        boolean isValid = false;
        if (age >= 0 && age <= 100) {
            isValid = true;
        }
        return isValid;

    }

    public static boolean isValidGender(String genderInput) {
        boolean isValid = false;
        if (genderInput.equalsIgnoreCase("male")) {
            isValid = true;
        }else if (genderInput.equalsIgnoreCase("female")) {
            isValid = true;
        }
        return isValid;

    }

    public static Boolean isValidphoneNumber(String phoneNumber) {
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

    public static boolean checkCustomerExist(int idInput, Customer[] customers) {
        boolean result = false;
        boolean isFounded = false;
        for (int i = 0; i < Supermarket.customers.length; i++) {
            if (Objects.nonNull(Supermarket.customers[i])) {
                if(
                       Supermarket.customers[i].getId()== idInput
                ){
                    System.out.println(Supermarket.customers[i]);
                    result = true;
                    isFounded = true;
                    break;
                }
            }
            else {
                break;
            }
    }
        return isFounded;
}
}

