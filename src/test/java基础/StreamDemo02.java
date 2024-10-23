package test.java基础;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-1","周芷若-2","赵敏-3","张强-4");

//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        list.stream().forEach(s-> System.out.println(s));

        long count = list.stream().count();

//        String[] strings = list. stream().toArray(value -> new String[value]);
//        Arrays.toString(strings);

        List<String> collect = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList());
//        System.out.println(collect);

        Set<String> set = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toSet());
//        System.out.println(set);

        Map<String, Integer> map = list.stream().
                collect(Collectors.toMap(s -> s.split("-")[0]
                , s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(map);
    }
}
