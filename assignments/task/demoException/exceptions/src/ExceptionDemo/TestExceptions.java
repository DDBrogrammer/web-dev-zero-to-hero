package ExceptionDemo;

import java.io.IOException;
import java.util.Optional;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            System.out.println(getStudent(1));
            getUserInput();
        }catch (StudentNotFoundException studentNotFoundException) {
            System.out.println(studentNotFoundException.getMessage());
        } catch (InvalidNumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    static String getStudent(int id) throws StudentNotFoundException{
        if(id==1){
            return "TUYEN";
        }
        Optional.ofNullable(null);
      throw new StudentNotFoundException();
    }

    static String getUserInput() throws InvalidNumberRangeException{
        throw new InvalidNumberRangeException(1,5);
    }

    static void getU() throws IOException {
        // co loi
        throw new IOException("ArithmeticException");
    }

    static void getB(){
        try {
          getC();

        }catch (Exception e) {
        }finally {

        }
    }
    static void getC() throws IOException,Exception {
        // co loi
        throw new IOException("ArithmeticException");
    }

    static void getD() {
        throw new ArithmeticException("ArithmeticException");
    }
}
