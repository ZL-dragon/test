package test.java基础;

public class 不死神兔 {
    public static void main(String[] args) {
        int rabbit = getRabbit(12);
        System.out.println(rabbit);
    }
    public static int getRabbit(int month){
        if (month<=2){
            return 1;
        }
        return getRabbit(month-1)+getRabbit(month-2);
    }
}
