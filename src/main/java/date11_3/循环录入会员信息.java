package date11_3;

import java.util.Scanner;

public class 循环录入会员信息 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        for(;;){
            System.out.println("请输入会员号(四位整数):");
            int num = x.nextInt();
            if (num <999||num>9999){
                System.out.println("非法输入,请重新输入");
                continue;
            }
            System.out.println("请输入会员生日");
            String date = x.next();
            System.out.println("请输入会员积分");
            int score = x.nextInt();
            System.out.println("您录入的会员信息是"+num+" "+date+" "+score);
        }
    }
}
