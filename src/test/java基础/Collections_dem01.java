package test.java基础;

import java.util.*;

public class Collections_dem01 {
    public static void main(String[] args)
    {
        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList, "赵六", "钱七", "孙八", "周九", "吴十", "郑十一", "王十二", "冯十三", "陈十四", "褚十五", "卫十六", "蒋十七", "沈十八", "韩十九", "杨二十");

        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "张三", "李四", "王五");
        Random random = new Random();

        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1,1,1,1,1,1,1);
        Collections.addAll(integers, 0,0,0);
        Collections.shuffle(integers);


        int index=random.nextInt(integers.size());
        int number = integers.get(index);
        if (number==1){
            int i = random.nextInt(boyList.size());
            System.out.println(boyList.get(i));
        }else{
            int i = random.nextInt(girlList.size());
            System.out.println(girlList.get(i));
        }

        HashMap<String, ArrayList> stringArrayListHashMap = new HashMap<>();
        ArrayList<String> jiangsuCities  = new ArrayList<>();
        Collections.addAll(jiangsuCities, "南京市", "无锡市", "徐州市", "常州市", "苏州市", "南通市", "连云港市", "淮安市", "盐城市", "扬州市", "镇江市", "泰州市", "宿迁市");
        ArrayList<String> guangdongCities  = new ArrayList<>();
        Collections.addAll(guangdongCities, "广州市", "韶关市", "深圳市", "珠海市", "汕头市", "佛山市", "江门市", "湛江市", "茂名市", "肇庆市", "惠州市", "梅州市", "汕尾市", "河源市", "阳江市", "清远市", "东莞市", "中山市", "潮州市", "揭阳市", "云浮市");

        stringArrayListHashMap.put("江苏", jiangsuCities);
        stringArrayListHashMap.put("广东", guangdongCities);

        Set<Map.Entry<String, ArrayList>> entries = stringArrayListHashMap.entrySet();
        for (Map.Entry<String, ArrayList> entry : entries) {
            ArrayList<String> value = entry.getValue();
            StringJoiner stringJoiner = new StringJoiner(",", "", "");
            for (String o : value) {
                stringJoiner.add(o);
            }
            System.out.println(entry.getKey() + "=" + stringJoiner);
        }
    }



    }
