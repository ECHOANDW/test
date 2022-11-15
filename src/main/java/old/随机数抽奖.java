package old;

import java.util.Scanner;

public class 随机数抽奖 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
       do{
        System.out.println("请输入您的会员号");
        int s1 = x.nextInt();//这是你的会员号
        int a = s1 % 1000;
        int b = a / 100;//获得的百位数
           int ran = (int) (Math.random() * 10);
        if (b == ran) {
            System.out.println("您的百位号为"+b);
            System.out.println("本次随机数为"+ran);
            System.out.println("恭喜您中奖了,获得iPhone14 pro max一台");
            break;
        } else {
            System.out.println("您的百位号为"+b);
            System.out.println("本次随机数为"+ran);
            System.out.println("很遗憾,您没中奖");

        }}while(true);
    }
}