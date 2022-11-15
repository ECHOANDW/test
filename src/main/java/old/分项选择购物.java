package old;

import java.util.Scanner;

public class 分项选择购物 {
    public static void main(String[] args) {
        System.out.println("请输入消费金额");
        Scanner x = new Scanner(System.in);
        double get = x.nextDouble();
        System.out.println("您的金额是"+get+"是否参加换购活动");
        System.out.println("1.满50元,加两元换购百事可乐一瓶");
        System.out.println("2.满100元,加三元换购500ml可乐一瓶");
        System.out.println("3.满100元,加10元换购5公斤面粉");
        System.out.println("4.满200元,加十元个换购一个苏维埃炒锅");
        System.out.println("5.满200元,加20元可换购大美利坚爽肤水一瓶");
        System.out.println("0.不换购");
        System.out.println("请选择");
        int y =1;
        String a1 = "您未选择换购";
        for (int i = 1;i == 1; ) {
            int num = x.nextInt();
            System.out.println(num);
            switch (num) {
                case 1:
                    if (get >= 50) {
                        get += 2;
                         a1 = "本次换购百事可乐一瓶";
                        i =2;
                       break;
                    } else {
                        System.out.println("抱歉,您的消费金额不够");
                    }
                    i = 1;
                    break;
                case 2:
                    if (get >= 100) {
                        get += 3;
                        a1 = "本次换购500ml可乐一瓶";
                        i =2;
                        break;
                    } else {
                        System.out.println("抱歉,您的消费金额不够");
                        i = 1;
                        break;
                    }
                case 3:
                    if (get >= 100) {
                        get += 10;
                         a1 = "本次换购5公斤面粉";
                        i =2;
                        break;
                    } else {
                        System.out.println("抱歉,您的消费金额不够");
                        i = 1;
                        break;
                    }
                case 4:
                    if (get >= 200) {
                        get += 10;
                       a1 = "本次换购苏维埃炒锅一个";
                        i =2;
                        break;
                    } else {
                        System.out.println("抱歉,您的消费金额不够");
                        i = 1;
                        break;
                    }
                case 5:
                    if (get >= 200) {
                        get += 20;
                        a1 = "本次换购大美利坚爽肤水一瓶";
                        i =2;
                        break;
                    } else {
                        System.out.println("抱歉,您的消费金额不够");
                        i = 1;
                        break;
                    }
                case 0:
                    y = 2;
                    break;
            }
        }
        System.out.println("您的消费总金额:"+ get);
        System.out.println("成狗换购"+a1);
    }
}
