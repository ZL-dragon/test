package test.java基础;

import java.util.ArrayList;
import java.util.Iterator;

public class 集合_collection_list {
    public static void main(String[] args) {
        // 集合_collection_list
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        strings.add(1, "e");
//        String remove = strings.remove(0);
//        System.out.println(remove);
        strings.set(0,"f");
        System.out.println(strings);
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        strings.forEach(s -> System.out.println(s));
    }
}
