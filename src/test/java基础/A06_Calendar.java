package test.java基础;

import java.util.Calendar;
import java.util.Date;

public class A06_Calendar {
    public static void main(String[] args)
    {
        Calendar instance = Calendar.getInstance();
        Date date = new Date();
        instance.setTime(date);
    }
}
