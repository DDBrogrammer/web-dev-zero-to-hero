package untils;


import entities.Cart;
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
        boolean isValid = false;
        if (productQuantity<=0) {
            System.out.println("so luong san pham phai lon hon 0");
            return isValid;
        }else {
            isValid = true;
        }
        return isValid;
    }
    public static boolean isValidProductQuantityIncart(String quantity) {
        boolean isValid = false;
        boolean isFounded = false;
            for (int i = 0; i < Supermarket.products.length; i++) {
                if(Objects.nonNull(Supermarket.products[i])) {
                    if (Supermarket.products[i].getQuantity() <= Integer.parseInt(quantity)) {
                        System.out.println("them so luong san pham thanh cong ");
                    }
                       else {
                         isFounded = true;
                           isValid = true;
                        break;
                       }
                }
        }
            if(!isFounded){
                System.out.println("them san pham that bai");
        }
        return isValid;

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
        if (gtin.length() != 1) {
            System.out.println("sai do dai gtin");
            return false;
        }
        Optional<Product> ProductOptional = ProductService.getProductByGtin(gtin);
        if (ProductOptional.isPresent()) {
            System.out.println("ban dang chon sản phẩm: "+ ProductOptional.get());
        }else {
            System.out.println("không tìm thấy sản phẩm  ");
        }
        return ProductOptional.isPresent();
    }


        public static boolean isValidProductQuantityBuy(int quantityInput, String gtinInput) {
            for (int i = 0; i < Supermarket.products.length; i++) {
                if (Supermarket.products[i] != null && Supermarket.products[i].getGtin().equals(gtinInput)) {
                    int stockQuantity = Supermarket.products[i].getQuantity();

                    if (quantityInput > stockQuantity) {
                        System.out.println("Số lượng cần mua phải ít hơn hoặc bằng số lượng sản phẩm trong kho (" + stockQuantity + ").");
                        return false;
                    } else {
                        // Trừ số lượng đặt mua khỏi kho
                        Supermarket.products[i].setQuantity(stockQuantity - quantityInput);
                        System.out.println("Thêm số lượng sản phẩm mua thành công. Số lượng còn lại trong kho: "
                                + Supermarket.products[i].getQuantity());
                        return true;

                    }
                }
            }

            // Trường hợp không tìm thấy sản phẩm với GTIN được cung cấp
            System.out.println("Không tìm thấy sản phẩm với GTIN: " + gtinInput);
            return false;
        }
}




