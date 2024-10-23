package test.java基础;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 集合_collection {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList();
        c.add("a");
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
//        c.clear();
//        c.remove("a");
        boolean res=c.contains("a");
        System.out.println(c);
        System.out.println(res);
        //迭代器遍历
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //增强for遍历
        for (String s:c){
            System.out.println(s);
        }
        //lambda表达式遍历
        c.forEach(s -> System.out.println(s));
    }
}
