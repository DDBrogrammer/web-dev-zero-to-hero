package demo;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
    static Collection<String> set;
    static Collection<String> subSet;

    static {
        set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");
        set.add("H");
        set.add("I");
        set.add("J");
        set.add("K");
        subSet=new HashSet<>();
        subSet.add("A");
        subSet.add("B");
        subSet.add("E");
        subSet.add("F");
    }

    public static void main(String[] args) {
        set.add("A");
        set.add("test");
        set.add("test1");
        set.add("test2");
        System.out.println(set);
        set = new TreeSet<>(set);
        set.add("asdasdasdasdas");
        set.add("asdasdasdasdas1");
        set.add("asdasdasdasdas12");
        set.add("asdasdasdasdas122");
        System.out.println(set);
    }
}
