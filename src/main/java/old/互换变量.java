package old;

import java.util.Scanner;

public class 互换变量 {
    public static void main(String[] args) {
        System.out.println("输出互换前手中的纸牌");
        Scanner x = new Scanner(System.in);
        int zuo = x.nextInt();
        int you = x.nextInt();

        int kong = zuo;
        zuo = you;
        you = kong;
        System.out.println("输出互换后手中的纸牌");
        System.out.println("左手"+ zuo);
        System.out.println("右手"+ you);


    }
}
