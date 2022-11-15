package old;

import java.util.Scanner;

public class 录入会员信息 {
    public static void main(String[] args) {
        System.out.println("请输入会员号(<4位整数>)");
        Scanner x = new Scanner(System.in);
        int i = 1;
        do {
            int num = x.nextInt();
            if (num < 1000 || num > 10000) {
                System.out.println("客户号" + num + "是无效的会员号");
                System.out.println("录入信息失败");
                i = 2;

            } else {
                System.out.println("请输入会员生日(月/日<用两位数表示>)");
                String day = x.next();
                System.out.println("请输入积分");
                int score = x.nextInt();
                System.out.println("已录入的会员信息是");
                System.out.println(num + "\t\t" + day+"\t\t" + score);
                  break;
            }



        }while (i == 2) ;
    }
}
