package old;

import java.util.Scanner;

public class 会员折扣 {
    public static void main(String[] args) {
        System.out.println("请输入是否是会员(y/否(其他字符))");
        Scanner x = new Scanner(System.in);
        String type = x.next();
        char num = type.charAt(0);
        if (num == 'y') {
            System.out.println("请输入您的付款金额");
            double go = x.nextDouble();
            if (go <= 100) {
                double F1 = go * 0.8;
                System.out.println("您应支付的金额是" + F1);
            } else {
                double F1 = go * 0.75;
                System.out.println("您应支付的金额是" + F1);
            }

        } else {
            System.out.println("请输入您的付款金额");
            double go = x.nextDouble();
            double F1 = go * 0.9;
            System.out.println("您应支付的金额是" + F1);
        }
    }
}