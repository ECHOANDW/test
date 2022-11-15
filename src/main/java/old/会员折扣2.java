package old;

import java.util.Scanner;

public class 会员折扣2 {
    public static void main(String[] args) {
        System.out.println("请输入您的会员积分");
        Scanner x = new Scanner(System.in);
        int scan = x.nextInt();
        if (scan <= 2000){double zhekou = 0.9;
            System.out.println("该会员享受的折扣是"+ zhekou);
    } else if (scan >= 2000 && scan < 4000) {
            double zhekou = 0.8;
            System.out.println("该会员享受的折扣是"+ zhekou);
        } else if (scan >= 4000 && scan < 8000 ) {
            double zhekou = 0.7;
            System.out.println("该会员享受的折扣是"+ zhekou);
        } else if (scan >= 8000) {
            double zhekou = 0.6;
            System.out.println("该会员享受的折扣是"+ zhekou);

        }

    }
    }
