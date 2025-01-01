package demo;

import java.util.*;

public class DemoCollection {
     static Collection<String> collections;
     static Collection<String> subCollections;
    static {
        collections = new ArrayList<String>();
        collections.add("A");
        collections.add("B");
        collections.add("C");
        collections.add("D");
        collections.add("E");
        collections.add("F");
        collections.add("G");
        collections.add("H");
        collections.add("I");
        collections.add("J");
        subCollections= new ArrayList<String>();
        subCollections.add("A");
        subCollections.add("F");
        subCollections.add("C");
    }
    public static void main(String[] args) {
        collectionsTravel();
        // các thao tác cơ bản:
        System.out.println("trả về số lượng phần tử đang chứa collections.size(): "+ collections.size());
        System.out.println(" collection hiện tại có rỗng hay không collections.isEmpty(): "+ collections.isEmpty());
        System.out.println(" collection có chứa phần tử này (Object element) không collections.contains(E): "+ collections.contains("E"));
        System.out.println(" thêm mới phần tử  vào collection"+ collections.add("E"));
        System.out.println(" loại bỏ phần tử khỏi collection"+ collections.remove("E"));
        System.out.println("tạo 1 Iterator"+ collections.iterator());

        // `method` hoạt động trên toàn bộ `Collection`:
        System.out.println("kiểm tra `collection` hiện tại có chứa `collection` c không: "+ collections.containsAll(subCollections));
        System.out.println("thêm phần toàn bộ phần tử từ `collection` khác vào `collection` hiện tại "+ collections.addAll(subCollections));
        System.out.println("loại bỏ toàn bộ các phần tử có trong `collection` c ở `collection` hiện tại "+ collections.removeAll(subCollections));
        System.out.println("loại bỏ toàn bộ các phần tử không có trong `collection` c ở `collection` hiện tại "+ collections.retainAll(subCollections));
        // xóa toàn bộ phần tử trong `collection` hiện tại
        collections.clear();
        System.out.println("lấy ra 1 mảng từ `collection` hiện tại "+ collections.toArray());

    }

    public static void collectionsCanChangeBetweenImplementation() {
        collections = new ArrayList<>(collections);
        collections = new LinkedList<>(collections);
        collections = new HashSet<>(collections);
    }


    public static void collectionsTravel() {
        collections.stream().forEach((e)->{
                    System.out.println(e);
                }
        );

        for (Object o : collections){
            System.out.println(o);
        }

        for (Iterator<String> iterator = collections.iterator() ;  iterator.hasNext(); ){
            System.out.println(iterator.next());
        }

    }

}
