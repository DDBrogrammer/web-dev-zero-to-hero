package services;


import entities.*;

import java.util.Objects;

import static entities.Cart.buyItems;




public class InvoiceService {
    public static void addInvoice(Customer customer, Employee employee, String description , int totalAmount, int quantityInput  ) {
        boolean result = false;
// Kiểm tra danh sách sản phẩm mua
        if (buyItems == null || buyItems.length == 0) {
            System.out.println("Danh sách sản phẩm mua trống, không thể tạo hóa đơn.");
            return;
        }
        for (int i = 0; i < Supermarket.invoices.length; i++) {
            if (Objects.isNull(Supermarket.invoices[i])) {
                Supermarket.invoices[i] = new Invoice(buyItems, customer, description, employee, totalAmount);
                Supermarket.invoices[i].setTotalAmount(totalAmount);
                
                System.out.println("Sản phẩm đã được thêm vào giỏ hàng: " + Supermarket.invoices[i]);
                result = true;
                break; //
            } else {

                System.out.println("Sản phẩm trong giỏ hàng: " + Supermarket.invoices[i]);
            }
        }

        /*for (int i = 0; i < Supermarket.products.length; i++) {
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
        }*/

//
        if (!result) {
            System.out.println("Giỏ hàng đã đầy. Không thể thêm sản phẩm mới.");
        }}}


