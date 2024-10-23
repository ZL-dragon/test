package test.java基础;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张无忌","张无忌","周芷若","赵敏","张强","张三丰","张无忌");

//        list.stream().forEach(s->System.out.println(s));
//        list.stream().filter(s->s.startsWith("张")).forEach(s -> System.out.println(s));

//        list.stream().limit(3).forEach(s -> System.out.println(s));

//        list.stream().skip(3).forEach(s -> System.out.println(s));

        list.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println(list);




        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("张无忌", 19);
        hm.put("周芷若", 18);
        hm.put("赵敏", 17);
        hm.put("张强", 20);
        hm.put("张三丰", 1000);

//        hm.keySet().stream().forEach(s-> System.out.println(s));
//        hm.entrySet().stream().forEach(s-> System.out.println(s));

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        Arrays.stream(arr).forEach(i-> System.out.println(i));

    }
}
