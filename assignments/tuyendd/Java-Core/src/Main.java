import entities.Product;
import helper.Helper;
import service.ProductService;

public class Main {
    static Helper helper=new Helper();
    static ProductService productService =new ProductService();
    static Product[] productList =new Product[100];
    public static void main(String[] args) {

           boolean run = true;

           do{
               helper.printMenu();
               int chose=helper.getInt(" ");
               switch(chose){
               case 1:
                   int chose_1;
                   do {
                       chose_1 = helper.getInt("Nhập lựa chọn:\n"
                               + "[1] Thêm sản phẩm.\n"
                               + "[2] xem thông tin sản phẩm.\n"
                               + "[3] cập nhật số lượng tồn kho. \n"
                               + "[4] Quay lại.\n"
                       );
                       if(chose_1>=1 && chose_1<=4){
                           break;
                       }
                       System.out.println("Bạn phải nhập số nguyên từ 1 đến 4");
                   } while(true);
                   if (chose_1 == 1){}

                   Product [] newProductList = productService.getInputListProduct(productList);
                   mergeNewProductListAndSetId(newProductList);

               }
           }
           while (run);
            System.out.println("Đã thoát chương trình");
        }

    private static void mergeNewProductListAndSetId(Product[] newProductList) {
        int id=10000;
        int t=0;
        int trueProductListLength= productService.getTrueProductLength(productList);
        System.out.println(trueProductListLength);
        int newProductListLength=newProductList.length;
        System.out.println(newProductListLength);
        int totalLength= trueProductListLength+newProductListLength;
        for(int i=trueProductListLength;i<= totalLength-1;i++){
            productList[i]=new Product(trueProductListLength+id,
                    newProductList[t].getName(),
                    newProductList[t].getPrice(),
                    newProductList[t].getStockQuantity());


            t++;
            id++;
    }
    }
}
