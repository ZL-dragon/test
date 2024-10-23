package test.java基础;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        String startStr="2023年11月11日 0:0:0";
        String endStr="2023年11月11日 23:59:59";
        String format = "yyyy年MM月dd日 HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date parse = simpleDateFormat.parse(startStr);
        Date parse1 = simpleDateFormat.parse(endStr);
        if (parse.getTime()-parse1.getTime()<0){
            System.out.println("开始时间不能大于结束时间");
        }else {
            System.out.println("开始时间小于结束时间");
        }
        }
    }
