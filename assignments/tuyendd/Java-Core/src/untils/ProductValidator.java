package untils;



import entities.Product;
import entities.Supermarket;
import services.ProductService;

import java.util.Objects;
import java.util.Optional;

public class ProductValidator {
    static public boolean isValidNumberOfgtin(int numberOfgtin) {
        boolean isValid = false;
        if (numberOfgtin<=0) {
            System.out.println("so luong dau sach phai lon hon 0");
            return isValid;
        }else {

            isValid = true;
        }
        return isValid;
    }

    public static boolean isValidgtin(String gtin) {
        boolean isValid = false;
        if (gtin.length()!=1) {
            System.out.println("sai do dai");
            return false;
        }else {
            for (int i = 0; i < Supermarket.products.length; i++) {
                if(Objects.nonNull(Supermarket.products[i])) {
                    if (Supermarket.products[i].getGtin().equals(gtin)) {
                        System.out.println("id da ton tai");
                        isValid =false;
                        break;

                    }
                }
                isValid = true;
            }
        }

        return isValid;
    }

    public static boolean isValidprice(String price) {
        boolean isValid = false;
        if (price.length()<=0) {
            System.out.println("gia san pham phai lon hon 0 ");
            return isValid;
        } else isValid = true;
        return isValid;
    }

    public static boolean isValidProductQuantity(int productQuantity) {
        if (productQuantity <= 0) {
            System.out.println("Số lượng sản phẩm phải lớn hơn 0.");
            return false;
        }
        return true;
    }


    public static boolean checkProductExist(String productGtin  , Product[] products) {
        boolean result = false;
        boolean isFounded = false;
        for (int i = 0; i < Supermarket.products.length; i++) {
            if (Objects.nonNull(Supermarket.products[i])) {
                if(
                        Supermarket.products[i].getGtin().equals(productGtin )
                ){
                    System.out.println(Supermarket.products[i]);
                    result = true;
                    isFounded = true;
                    break;
                }
            }
            else {
                break;
            }
    }
        if(!isFounded){
            System.out.println("them san pham that bai");
        }
        return result;
}

    public static boolean isProductExist(String gtin) {
        if (gtin == null || gtin.isEmpty()) {
            System.out.println("GTIN không được để trống.");
            return false;
        }

       /* if (gtin.length() < 8 || gtin.length() > 14) {
            System.out.println("Sai độ dài GTIN. GTIN phải từ 8 đến 14 ký tự.");
            return false;
        }*/

        // Tìm sản phẩm theo GTIN
        Optional<Product> productOptional = ProductService.getProductByGtin(gtin);

        if (productOptional.isPresent()) {
            System.out.println("Bạn đang chọn sản phẩm: " + productOptional.get());
            return true;
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
            return false;
        }
    }


        public static boolean isValidProductQuantityBuy( int productQuantity , Product product) {
            for (int i = 0; i < Supermarket.products.length; i++) {

                if (Supermarket.products[i] != null ) {
                    int stockQuantity = Supermarket.products[i].getQuantity();

                    // Kiểm tra số lượng sản phẩm trong kho
                    if (productQuantity > stockQuantity) {
                        System.out.println("Số lượng cần mua phải ít hơn hoặc bằng số lượng sản phẩm trong kho (" + stockQuantity + ").");
                        return false;
                    } else if (productQuantity <= 0) {
                        System.out.println("Số lượng cần mua phải lớn hơn 0.");
                        return false;
                    } else {
                        // Trừ số lượng đặt mua khỏi kho
                        Supermarket.products[i].setQuantity(stockQuantity - productQuantity);
                        System.out.println("Thêm số lượng sản phẩm mua thành công. Số lượng còn lại trong kho: "
                                + Supermarket.products[i].getQuantity());
                        return true;
                    }
                }
            }

// Trường hợp không tìm thấy sản phẩm với GTIN được cung cấp
            System.out.println("Không tìm thấy sản phẩm với GTIN: " + productQuantity);
            return false;
}
}




