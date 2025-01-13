package controller;

import entities.Customer;
import untils.CustomerValidator;
import untils.Hepler;
import untils.InvoiceValidator;

public class InvoiceController {

    public static void addInvoice() {
        boolean result = false;
        int  numberOfInvoice = 0;
        do {
            numberOfInvoice   = Hepler.getIntInput("Nhập số lượng hóa đơn cần tạo  ");
        }
        while (
                !InvoiceValidator.isValidNumberOfInvoice(numberOfInvoice));
        for ( int i = 0; i < numberOfInvoice; i++ );
         String nameInput = "";
         String nameProductInput = "";
         String nameCustomerInput = "";
         String addressInput = "";
         String vocherInput = "";
         String description = "";

        {
          do {
              nameInput = Hepler.getString("Nhập tên nhân viên su lý đơn ");
          } while (
                 ! InvoiceValidator.isValidName(nameInput));
        }
        do {
            nameProductInput = Hepler.getString("Nhập tên san pham ");
        }
             while ( ! InvoiceValidator.isValidNameProduct(nameProductInput ));
        do {
            nameCustomerInput = Hepler.getString("Nhập tên khach hang ");
        }
        while ( ! InvoiceValidator.isValidNameCustomer(nameCustomerInput  ));
    }

    public static void calculate() {

    }
}
