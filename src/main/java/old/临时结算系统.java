package old;

import java.util.Scanner;

public class 临时结算系统 {
    public static void main(String[] args) {
        System.out.println("请输入您想要购买的商品,本店所有商品打8折");
        String c1 = "1.三鲜伊面(1.5软妹币)";
        String c2 = "2.霸王丝(0.5软妹币)";
        String c3 = "3.旭日升(1.5软妹币)";
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        Scanner x = new Scanner(System.in);
        double m = x.nextDouble();
        double n = x.nextDouble();
        double b = x.nextDouble();
        System.out.println("您的总金额为");
        if (m != 1){ m = 0;}
        else {  m = 1.5; }
        if (n != 2){ n = 0;}
        else {  n = 0.5; }
        if (b != 3){ b = 0;}
        else {  b = 1.5; }
        System.out.println("您需要支付的总金额为");
        double F1 = m * 0.8;
        double F2 = n * 0.8;
        double F3 = b * 0.8;
        System.out.println(F1 + F2 + F3);

    }
}

