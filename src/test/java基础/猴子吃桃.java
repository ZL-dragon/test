package test.java基础;

public class 猴子吃桃 {
    public static void main(String[] args) {
        System.out.println(getPeach(1));
    }
    public static int getPeach(int day){
        if (day==10){
            return 1;
        }
        return (getPeach(day+1)+1)*2;
    }
}
