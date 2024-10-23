package test.java基础;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String startDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(startDate);
        String endDate = now.plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(endDate);
        LocalDateTime of = LocalDateTime.of(2023, 1, 1, 0, 0);
        LocalDateTime dt = LocalDateTime.parse("2019-11-19T15:16:17");
        LocalDateTime parse = LocalDateTime.parse("2019-11-19T15:16:17");
        System.out.println(dt);
        System.out.println(parse);
        // 自定义格式化:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));


        String date = "2017-03-08 12:30:11";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, format);

        System.out.println("origional date as string: " + date);
        System.out.println("generated LocalDateTime: " + dateTime);



    }
}
