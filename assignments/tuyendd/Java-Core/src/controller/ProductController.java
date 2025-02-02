package controller;

import entities.Product;
import services.ProductService;
import untils.Hepler;
import untils.ProductNotFoundException;
import untils.ProductValidator;

import java.util.Objects;

public class ProductController {

    public static boolean addProduct() {
        boolean result = false;
        int numberOfgtin = 0;
        do {
            numberOfgtin = Hepler.getIntInput("Nhập số lượng đầu mỗi sản phẩm  ")
            ;
        }
        while (
               ! ProductValidator.isValidNumberOfgtin(numberOfgtin));
        for (int i = 0; i < numberOfgtin; i++) {
            String gtinInput = "";
            String titleInput = "";
            int priceInput = 0;
            int quantityInput = 0;
            double vocher = 0 ;
            do {
                gtinInput   = Hepler.getString("Nhập gtin sản phâm ");
            }while (
                    !ProductValidator.isValidgtin(gtinInput));
            do {
                titleInput = Hepler.getString("Nhập tên sản phẩm ");
            } while (
                    titleInput.isEmpty());
            do {
                priceInput  = Hepler.getIntInput("Nhập giá sản phẩm ");
            }
                while (!ProductValidator.isValidprice(String.valueOf(priceInput)));
            do {
                quantityInput = Hepler.getIntInput( "Nhập số lượng sản phẩm ");
            } while (
                    !ProductValidator.isValidProductQuantity( quantityInput)
            );
            ProductService.addProduct( gtinInput, titleInput, priceInput , quantityInput);

              }

    return result;
    }
    public static boolean showInformaytionProductbygtin() {
        boolean result = false;
        int numberOfgtin = 0;

        do {
            numberOfgtin = Hepler.getIntInput("Nhập số lượng đầu mỗi sản phẩm  ")
            ;
        }
        while (
                ! ProductValidator.isValidNumberOfgtin(numberOfgtin));
        for (int i = 0; i < numberOfgtin; i++) {
            String gtinInput = "";
            gtinInput   = Hepler.getString("Nhập gtin sản phâm ");
            ProductService.printProductDetails( gtinInput);

        };

        return result;
    }

    public static void updateQuantityProduct(

    ) {
           ProductService.printProductList();
           boolean result = false;
        String gtin = "";
        int quantityInput = 0;
        do {
            gtin  = Hepler.getString("nhập gtin của sản phẩm ");
        } while (
                !ProductValidator.isProductExist(gtin)
        );
        do {
            quantityInput = Hepler.getIntInput("nhap so luong muon them");
        }
        while (
              !ProductValidator.isValidProductQuantity(quantityInput)
        );
        if (ProductService.updateQuantityProduct(quantityInput)) {
            System.out.println("");
            ProductService.printProductList();
        }else {
            System.out.println("");
        }
    }

    public static boolean deleteProduct() {
        ProductService.printProductList(); // In danh sách sản phẩm trước khi xóa
        boolean result = false;

        while (true) {
            String gtin = Hepler.getString("Nhập GTIN của sản phẩm (hoặc nhập 'exit' để thoát): ");

            // Cho phép thoát khỏi vòng lặp nếu người dùng nhập "exit"
            if (gtin.equalsIgnoreCase("exit")) {
                System.out.println("Hủy thao tác xóa sản phẩm.");
                return false;
            }

            // Kiểm tra sản phẩm có tồn tại không
            if (!ProductValidator.isProductExist(gtin)) {
                System.out.println("Sản phẩm không tồn tại, vui lòng nhập lại.");
                continue;
            }

            // Xóa sản phẩm nếu tồn tại
            if (ProductService.deleteProduct(gtin)) {
                System.out.println("Sản phẩm đã được xóa thành công!");
                ProductService.printProductList(); // In danh sách sau khi xóa
                result = true;
            } else {
                System.out.println("Lỗi: Không thể xóa sản phẩm. Vui lòng thử lại.");
            }
            break; // Thoát khỏi vòng lặp sau khi thực hiện xóa
        }

        return result;
}
}
