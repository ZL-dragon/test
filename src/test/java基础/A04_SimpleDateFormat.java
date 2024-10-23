package test.java基础;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04_SimpleDateFormat {

    public static void main(String[] args) {
        String str="2000-11-11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(str);
            String yyyy年MM月dd日 = new SimpleDateFormat("yyyy年MM月dd日").format(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
