package test.java基础;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemoTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"张三-23","李四-24","王五-25","赵六-26","田七-27");
        Map<String, Integer> map = arrayList.stream().filter(s -> Integer.parseInt(s.split("-")[1]) >= 24).collect(Collectors.toMap(s -> s, s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(map);

        
    }
}
