package services;

import entities.Cart;
import entities.Product;
import entities.Supermarket;
import untils.Hepler;
import untils.ProductNotFoundException;
import untils.ProductValidator;

import java.util.Objects;
import java.util.Optional;

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
    public static void printProductDetails(String gtinInput)throws ProductNotFoundException {
        boolean result = false;
        boolean isFounded = false;

        try {
            for (int i = 0; i < Supermarket.products.length; i++) {
                if (Supermarket.products[i].getGtin().equals(gtinInput)) {
                    result = true;
                    isFounded = true;

                }
            }
        }
        catch(ProductNotFoundException productNotFoundException) {
            System.out.println(productNotFoundException.getMessage();
        }

        for (int i = 0; i < Supermarket.products.length; i++) {
         if (Objects.nonNull(Supermarket.products[i])) {
             if(
                     Supermarket.products[i].getGtin().equals(gtinInput)
             ){
                 System.out.println(Supermarket.products[i]);
                    result = true;
                    isFounded = true;
                    break;
             }
         }
     }

     if (!isFounded){
         System.out.println("không có thông tin sản phẩm  ");
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
    public static Product getProductGtin(Product[] products) {
        Product product = new Product("", "", 0, 0, 0);
        String gtinInput;
        int quantityInput;

        while (true) {
            // Nhập GTIN
            gtinInput = Hepler.getString("Nhập mã GTIN sản phẩm: ");
            if (!ProductValidator.checkProductExist(gtinInput, products)) {
                System.out.println("Sản phẩm với GTIN này không tồn tại. Vui lòng thử lại.");
                continue;
            }
            else {
            // Nhập số lượng
            do {
                quantityInput = Hepler.getIntInput("Nhập số lượng sản phẩm: ");
                if (!ProductValidator.isValidProductQuantityBuy(quantityInput, gtinInput)) {
                    System.out.println("Số lượng nhập không hợp lệ. Vui lòng nhập lại.");
                }
            } while (!ProductValidator.isValidProductQuantityBuy(quantityInput, gtinInput));

            // Tìm sản phẩm theo GTIN
            for (Product p : products) {
                if (p != null && p.getGtin().equals(gtinInput)) {
                    product.setGtin(gtinInput);
                    product.setQuantity(p.getQuantity());
                    product.setName(p.getName());
                    product.setPrice(p.getPrice());
                    product.setNumberOfProduct(p.getNumberOfProduct());
                    return product; // Thoát sau khi tìm thấy sản phẩm
                }
            }

            System.out.println("Không tìm thấy sản phẩm. Vui lòng nhập lại.");
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
        boolean result = false;
        boolean isDelete = false;
        for (int i = 0; i < Supermarket.products.length; i++) {
            if (Objects.nonNull(Supermarket.products[i])) {
                if (Supermarket.products[i].getGtin().equals(gtin)) {
                    Supermarket.products[i] = null;

                    isDelete = true;
                }
                if (isDelete) {
                    Supermarket.products[i-1] = Supermarket.products[i];
                }
            }
        }
        return result;
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



