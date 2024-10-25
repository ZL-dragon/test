package test.java基础;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        String[] arr = new String[]{"武汉加油", "中国加油", "世界加油"};
        Stream<String> stream = Arrays.stream(arr);

        stream = Stream.of("武汉加油", "中国加油", "世界加油");

        List<String> list = new ArrayList<>();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        stream = list.stream();

        //通过 filter() 方法可以从流中筛选出我们想要的元素
        List<String> list2 = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");
        Stream<String> stream2 = list.stream().filter(element -> element.contains("王"));
        stream2.forEach(System.out::println);

        //如果想通过某种操作把一个流中的元素转化成新的流中的元素，可以使用 map() 方法。
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");
        //list.stream().map(s -> s.length()).forEach(System.out::println);

        String[] strings = list.stream().toArray(String[]::new);
        Arrays.toString(strings);

    }
}
