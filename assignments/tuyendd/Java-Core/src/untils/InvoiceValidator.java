package untils;

import java.util.OptionalInt;

public class InvoiceValidator {
    public static boolean isValidNumberOfInvoice(int numberOfInvoice) {
        boolean isValid = false;
        if (numberOfInvoice<=0) {
            System.out.println("so luong invoice phai lon hon 0");
            return isValid;
        }else {
            isValid = true;
        }
        return isValid;

    }
    public static boolean isValidName(String customer) {
        for (char c : customer.toCharArray()) {
            if (Character.isDigit(c)) {
                return false; // Nếu có chữ số, trả về false
            }
        }
        return true;
    }

    public static boolean isValidNameProduct(String product) {
        return isValidName(product);
    }

    public static boolean isValidNameCustomer(String customer) {
        return isValidName(customer);

    }
}
