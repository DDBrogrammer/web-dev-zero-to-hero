package controller;

import services.ProductService;
import untils.Hepler;
import untils.ProductValidator;

public class ProductController {

    public static boolean addProduct() {
        boolean result = true;
        int numberOfgtin = 0;

        do {
            numberOfgtin = Hepler.getIntInput("Nhập số lượng đầu mỗi sản phẩm: ");
        } while (!ProductValidator.isValidNumberOfgtin(numberOfgtin));

        for (int i = 0; i < numberOfgtin; i++) {
            String titleInput;
            int priceInput;
            int quantityInput;

            // Nhập tên sản phẩm
            do {
                titleInput = Hepler.getString("Nhập tên sản phẩm: ");
            } while (titleInput.isEmpty());

            // Nhập giá
            do {
                priceInput = Hepler.getIntInput("Nhập giá sản phẩm: ");
            } while (!ProductValidator.isValidprice(String.valueOf(priceInput)));

            // Nhập số lượng
            do {
                quantityInput = Hepler.getIntInput("Nhập số lượng sản phẩm: ");
            } while (!ProductValidator.isValidProductQuantity(quantityInput));

            // Thêm sản phẩm

            ProductService.addProduct( titleInput, priceInput, quantityInput);
        }
        return result;
    }
    public static boolean showInformaytionProductbygtin() {
        boolean result = false;
        int numberOfgtin = 0;

        do {
            numberOfgtin = Hepler.getIntInput("Nhập số lượng sản phẩm cần xem thông tin: ");
        } while (!ProductValidator.isValidNumberOfgtin(numberOfgtin));

        for (int i = 0; i < numberOfgtin; i++) {
            String gtinInput = Hepler.getString("Nhập GTIN sản phẩm: ");
            ProductService.printProductDetails(gtinInput);
        }

        return result;
    }
    public static void updateQuantityProduct() {
        ProductService.printProductList();

        String gtin;
        int quantityInput;

        do {
            gtin = Hepler.getString("Nhập GTIN của sản phẩm: ");
        } while (!ProductValidator.isProductExist(gtin));

        do {
            quantityInput = Hepler.getIntInput("Nhập số lượng muốn thêm: ");
        } while (ProductValidator.isValidProductQuantity(quantityInput));

        if (ProductService.updateQuantityProduct(Integer.parseInt(gtin), quantityInput)) {
            System.out.println("Cập nhật số lượng thành công!");
            ProductService.printProductList();
        } else {
            System.out.println("Có lỗi xảy ra!");
        }
    }

    // ================== DELETE PRODUCT ==================

    public static boolean deleteProduct() {

        ProductService.printProductList();
        boolean result = false;
        String gtin;

        do {
            gtin = Hepler.getString("Nhập GTIN sản phẩm cần xoá: ");
        } while (!ProductValidator.isProductExist(gtin));

        if (ProductService.deleteProduct(gtin)) {
            System.out.println("Xoá sản phẩm thành công!");
            ProductService.printProductList();
        } else {
            System.out.println("Có lỗi xảy ra!");
        }

        return result;
    }
}
