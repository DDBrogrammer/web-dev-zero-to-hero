package generic;

import java.util.Optional;

public class Box<O,T> {
    private O item1;// String
    private T item2;// Cat

    public void setItem(O item) {
        this.item1 = item;
    }
    public void setItem2(T item) {
        this.item2 = item;
    }

    public O getItem1() {
        return item1;
    }
    public T getItem2() {
        return item2;
    }

    public static void main(String[] args) {
        // int
        Optional<Cat> a =Optional.of(new Cat(""));

        Box<String,Cat> box = new Box<String,Cat>();
        box.setItem(new String("Hello"));
        box.setItem2(new Cat("cafe"));
    }
}
