package test.java基础;

import java.util.HashMap;

public class 集合_Map {
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(2, "2");
        map.put(1, "3");
        map.put(3, "4");

//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

//        Set<String> strings = map.keySet();
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next+":"+map.get(next));
//        }

        map.forEach(( key, value)-> System.out.println(key+":"+value));
        System.out.println(map);

    }
}
