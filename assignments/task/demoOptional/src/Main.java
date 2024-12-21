import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
           Optional<String> optional = getOptionalOf();
           // check giá trị null ko
           if (optional.isPresent()) {
               System.out.println(optional.get());
           }
           // nếu optional ko null triển khai code trong ifPresent
        optional.ifPresent(
                s -> {
                    System.out.println(s);
                }
        );
      // Trả về giá trị bên trong Optional nếu tồn tại, không thì trả về ""
      // hạn chế dùng do new String() luôn được gọi
       String a = getOptionalOfNullable().orElse(new String());
      //  trả về giá trị bên trong Optional nếu tồn tại không thì trả về new String()
        // dùng thay cho orEls để hạn chế gọi nhiều lần
         String b = getOptionalOfNullable().orElseGet(()->new String());
       // Ném Exception nếu Optional chứa null.
         String c = getOptionalOfNullable().orElseThrow(() -> new IllegalArgumentException("No value present"));


        List<String> companyNames = Arrays.asList(
                "paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);
        // Biến đổi giá trị trong Optional. Nếu null, trả về Optional.empty()
        int size = listOptional
                .map(List::size)
                .orElse(0);
        // Dùng khi có 2 Optional lồng nhau
        Optional<String> upper = optional.flatMap(value -> Optional.of(value.toUpperCase()));
    }

    public static Optional<String> getOptionalOf() {
        // Tạo một Optional chứa giá trị không null.
        // Ném ra NullPointerException. khi giá trị bị null
//        Optional<String> optional = Optional.of(null);
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }
        // Sử dụng: Khi chắc chắn giá trị không bao giờ là null.
        return Optional.of("Hello");
    }

    public static Optional<String> getOptionalOfNullable() {
        // Tạo một Optional có thể chứa giá trị là null hoặc không null.
        // Sử dụng: Khi không chắc chắn giá trị có thể là null.
        return Optional.ofNullable("Hello");
    }

    public static Optional<String> getOptionalEmpty() {
        // optional ko có giá trị
        return Optional.empty();
    }

    public static void checkNullInput(String string) {
       if (string == null) {
           throw new NullPointerException("String is null");
       }
        if (Objects.isNull(string)) {
            throw new NullPointerException("String is null");
        }
        if (Objects.nonNull(string)) {
            System.out.println(string);
        }
        Optional<String> optional = Optional.ofNullable(string);
        if (optional.isPresent()) {
            System.out.println(string);
        }
    }
}