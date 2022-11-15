package old;

import java.util.Scanner;

public class 幸运顾客 {
    public static void main(String[] args) {
        System.out.println("亲输入您的会员卡号");
        Scanner x = new Scanner(System.in);
        int num0 = x.nextInt();
        int qian = num0 / 1000;
        int bai = num0 % 1000 / 100;
        int shi = num0 % 1000 % 100 / 10;
        int ge = num0 % 1000 % 100 % 10;
        int F = ge + shi + bai + qian;
        System.out.println("您的会员卡号之和为" + F);
        if (F > 20) {
            System.out.println("恭喜您,您是中将客户");
        } else {
            System.out.println("很遗憾,您不是会员客户");
        }
    }
}