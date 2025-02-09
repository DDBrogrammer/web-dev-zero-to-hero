package untils;

public class VoucherNotFoundException extends Exception {
    public VoucherNotFoundException() {
        super("Voucher not found");
    }
}
