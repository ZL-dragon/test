package test.java基础;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] intro = new String[] { "沉", "默", "王", "二" };
        String[] revised = Arrays.copyOf(intro, 3);
        String[] expanded = Arrays.copyOf(intro, 5);
        System.out.println(Arrays.toString(revised));
        System.out.println(Arrays.toString(expanded));

        //copyOfRange() 方法需要三个参数，第一个是指定的数组，第二个是起始位置（包含），第三个是截止位置（不包含）
        String[] abridgement = Arrays.copyOfRange(intro, 0, 2);
        System.out.println(Arrays.toString(abridgement));


        System.out.println(Arrays.hashCode(intro));
        System.out.println(Arrays.hashCode(new String[] { "沉", "默", "王", "二" }));

        String[] intro1 = new String[] { "chen", "mo", "wang", "er" };
        String[] sorted = Arrays.copyOf(intro1, 4);
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));

        //rrays 类的 stream() 方法可以将数组转换成流：
        System.out.println(Arrays.stream(intro).count());

        //数组转list
        List<String> rets = Arrays.asList(intro);
        System.out.println(rets.contains("二"));
    }
}
