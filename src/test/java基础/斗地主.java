package test.java基础;

import java.util.*;

public class 斗地主 {
    public static void main(String[] args) {
        PokerGame pokerGame = new PokerGame();
    }
}

class PokerGame{
    static HashMap<Integer, String> hm=new HashMap<>();
    static ArrayList<Integer> list =new ArrayList<>();
    static {
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        int seriaNum=1;
        for (String number : numbers){
            for (String color : colors){
                hm.put(seriaNum,color+number);
                list.add(seriaNum);
                seriaNum++;
            }
        }
        hm.put(seriaNum,"小王");
        list.add(seriaNum);
        seriaNum++;
        hm.put(seriaNum,"大王");
        list.add(seriaNum);

    }
    public PokerGame(){
        System.out.println("斗地主游戏开始");
        Collections.shuffle(list);

        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            int pokerNum = list.get(i);
            if (i>=51){
                lord.add(pokerNum);
            }else if (i%3==0){
                player1.add(pokerNum);
            }else if (i%3==1){
                player2.add(pokerNum);
            }else{
                player3.add(pokerNum);
            }
        }
        lookpPoker("底牌",lord);
        lookpPoker("玩家1",player1);
        lookpPoker("玩家2",player2);
        lookpPoker("玩家3",player3);

    }
    public void lookpPoker(String name,TreeSet<Integer> ts){
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (Integer pokerNum : ts) {
            String s = hm.get(pokerNum);
            stringJoiner.add(s);
        }
        System.out.println(name+"的牌是："+stringJoiner);
    }

}