package entities;

import java.util.Arrays;

import static constant.Constant.SystemSize.CART_SIZE;



public class Cart {
    private int id;

    public static BuyItem[] buyItems=new BuyItem[CART_SIZE];

    public Cart() {
        // Initialize buyItems if needed
        // Hoặc khởi tạo giá trị mặc định phù hợp
        Arrays.fill(buyItems, null);
 }



    }

