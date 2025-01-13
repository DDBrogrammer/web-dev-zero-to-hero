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
      boolean isValid = false;
        String regex = "^\\+?[0-9]{10,15}$";
        if (Pattern.matches(regex, phoneNumber) ) {

            System.out.println(phoneNumber);

    }else {
            System.out.println("so dien thoai ko hop le , so dien thoai phai 12 chu so "
                    );
            isValid = true;
        }
        return isValid;
}


    public static boolean isValidIdOfCustomers(String idCustomer) {
        boolean isValid = false;
        for (int i = 0; i < Supermarket.customers.length; i++) {
            if (Objects.isNull(Supermarket.customers[i]) && Objects.isNull(Cart.buyItems[i]) && idCustomer.equals(Supermarket.customers[i].getId())) {
                isValid = true;
                break;
            }
            else {isValid = false;}


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

