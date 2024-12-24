package helper;

public class ValidateProduct {
    public boolean validateName(String name) {
        if(name.isEmpty()){
            System.out.println("Bạn chưa nhập tên san pham ");
            return false;
        }else if(
                name.length()>=200
        )  {
            System.out.println("Tên san pham qua dai quá dài");
            return  false;
        } else {
            return true;}
    }
}
