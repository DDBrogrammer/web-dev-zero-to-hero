package services;

import entities.Cart;
import entities.Product;
import entities.Supermarket;
import untils.Hepler;

import untils.ProductNotFoundException;
import untils.ProductValidator;

import java.util.Objects;
import java.util.Optional;
import java.util.zip.DataFormatException;

public class ProductService {

    public static void printProductList() {
        for (int i = 0; i < Supermarket.products.length; i++) {
            if (Objects.nonNull(Supermarket.products[i])) {
                System.out.println(Supermarket.products[i]);
            }else {
                break;
            }
        }


    }
    public static void printProductDetails(String gtinInput){
        boolean result = false;
        boolean isFounded = false;


        if (Supermarket.products != null) {
            for (int i = 0; i < Supermarket.products.length; i++) {

                if (Supermarket.products[i] != null && Supermarket.products[i].getGtin().equals(gtinInput)) {
                    System.out.println(Supermarket.products[i]);
                    result = true;
                    isFounded = true;
                    break;
                }
            }
        } else {
            System.out.println("Danh sách sản phẩm rỗng.");
        }

    }

    public static boolean addProduct(String gtin , String name  ,int price  , int quantity) {
        boolean result = false;
        Product product = new Product(gtin, name , price , quantity) ;

        for (int i = 0; i < Supermarket.products.length; i++) {
            if (Objects.isNull(Supermarket.products[i])) {
                Supermarket.products[i]=product;
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("them san pham  moi thanh cong");
            printProductList();
        }else {
            System.out.println("them san pham  moi that bai");
        }
        return result;

    }
    public static Product getProductGtin(Product[] products) throws ProductNotFoundException {
        Product product = new Product("", "", 0, 0, 0);
        String gtinInput;
     //   int quantityInput;

        if (products == null || products.length == 0) {
            System.out.println("Danh sách sản phẩm trống.");
            return null; // Hoặc xử lý logic khác phù hợp với ứng dụng của bạn
        }

        while (true) {
            // Nhập GTIN
            gtinInput = Hepler.getString("Nhập mã GTIN sản phẩm: ");
            if (!ProductValidator.checkProductExist(gtinInput, products)) {
                System.out.println("Sản phẩm với GTIN này không tồn tại. Vui lòng thử lại.");
                continue;
            }

            // Tìm sản phẩm theo GTIN
            boolean productFound = false;
            for (Product p : products) {
                if (p != null && p.getGtin().equals(gtinInput)) {
                    product.setGtin(gtinInput);
                    product.setName(p.getName());
                    product.setQuantity(p.getQuantity());
                    product.setPrice(p.getPrice());
                    product.setNumberOfProduct(p.getNumberOfProduct());
                    productFound = true;
                    break;
                }
            }

            if (productFound) {
                return product; // Trả về sản phẩm đã tìm thấy
            } else {
                System.out.println("Không thể tìm thấy sản phẩm trong danh sách. Vui lòng thử lại.");
            }
        }
    }
    public static Optional<Product> getProductByGtin(String gtin){
        for (int i = 0; i < Supermarket.products.length; i++) {
            if (Objects.nonNull(Supermarket.products[i]) && Supermarket.products[i].getGtin().equals(gtin)) {
                return Optional.of(Supermarket.products[i]);
            }
        }
        return Optional.empty();
    }

    public static boolean deleteProduct(String gtin) {
        boolean isDeleted = false;

        for (int i = 0; i < Supermarket.products.length; i++) {
            if (Supermarket.products[i] != null && Supermarket.products[i].getGtin().equals(gtin)) {
                isDeleted = true;

                // Dịch phần tử phía sau lên
                for (int j = i; j < Supermarket.products.length - 1; j++) {
                    Supermarket.products[j] = Supermarket.products[j + 1];
                }
                // Xóa phần tử cuối cùng sau khi dồn
                Supermarket.products[Supermarket.products.length - 1] = null;
                break; // Thoát vòng lặp sau khi xóa
            }
        }

        if (isDeleted) {
            System.out.println("");
        } else {
            System.out.println("Không tìm thấy sản phẩm với GTIN: " + gtin);
        }

        return isDeleted;
    }
    public static boolean updateQuantityProduct(int quantityInput ){
        boolean result = false;
        boolean  updateQuantity = false;
        for (int i = 0; i < Supermarket.products.length; i++) {
            if (Objects.nonNull(Supermarket.products[i])) {
                Supermarket.products[i].setQuantity(Supermarket.products[i].getQuantity()+quantityInput);
                updateQuantity = true;
                System.out.println(Supermarket.products[i]);
                break;

                }
              break;
            }

            return result;
        }


     }



