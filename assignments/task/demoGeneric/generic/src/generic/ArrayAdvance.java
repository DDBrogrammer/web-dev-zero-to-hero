package generic;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public class ArrayAdvance <T extends Animal>{

    private T[] array;

    @SuppressWarnings("unchecked")
    public ArrayAdvance(Class<T> clazz, int size) {
        array = (T[]) Array.newInstance(clazz, size);
    }

    // [book, book, null ]
//        for (int i = 0; i < Library.books.length; i++) {
//        if (Objects.isNull(Library.books[i])) {
//            Library.books[i]=book;
//            result = true;
//            break;
//        }
//    }
    void add(T element){// Book ,Employee ,Reader
        for (int i = 0; i < array.length; i++) {
          if (Objects.isNull(array[i])){
              array[i] = element;
              return;
          }
        }
    }

    T  isExist(T element){// Book ,Employee ,Reader
        for (int i = 0; i < array.length; i++) {
            if (Objects.nonNull(array[i])){
                if (array[i].equals(element)){
                    return array[i] ;
                }

            }
        }
        return null;
    }

    public static void printList(List<? extends Animal> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }



    void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        ArrayAdvance<Book> arrayAdvance = new ArrayAdvance<>(Book.class,10);
        arrayAdvance.add(new Book("ddd"));
        arrayAdvance.add(new Book("ddd12"));
        arrayAdvance.add(new Book("ddd12"));
        arrayAdvance.add(new Book("ddd33"));
        arrayAdvance.print();

        ArrayAdvance<Cat> arrayAdvanceCat = new ArrayAdvance<>(Cat.class,10);
        arrayAdvanceCat.add(new Cat("ddd"));
        arrayAdvanceCat.add(new Cat("ddd"));
        arrayAdvanceCat.add(new Cat("ddd"));
        arrayAdvanceCat.add(new Cat("ddd"));
        arrayAdvanceCat.add(new Cat("ddd"));
    }


}
