package test.java基础;

import java.util.TreeMap;

public class 集合_Map_TreeMap {
    public static void main(String[] args) {
        TreeMap<Character, String> integerStringTreeMap = new TreeMap<>((o1, o2)-> o2 - o1);
        integerStringTreeMap.put('a', "1");
        integerStringTreeMap.put('c', "2");
        integerStringTreeMap.put('b', "3");
        System.out.println(integerStringTreeMap);
    }
}
