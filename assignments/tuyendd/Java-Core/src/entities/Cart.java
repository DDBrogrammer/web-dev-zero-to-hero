package entities;

import java.util.Arrays;

import static constant.Constant.SystemSize.CART_SIZE;



public class Cart {
    private int id;

    public static BuyItem[] buyItems=new BuyItem[CART_SIZE];

    public Cart() {

        Arrays.fill(buyItems, null);
 }



    }

