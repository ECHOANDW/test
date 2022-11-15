package old;

import java.util.Scanner;

public class 已登录界面 {
 public static void main(String[] args) {
     boolean h = false;
     for (;h == false;){
        System.out.println("****************************");
        System.out.println("1.客户信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.真情回顾");
        System.out.println("4.注销");
        System.out.println("****************************");
        System.out.println("请选择，输入数字：");
        Scanner x = new Scanner(System.in);
        int a =  x.nextInt();

        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("正在加载中");
                h = true;
                break;
            default:
                System.out.println("输入错误,请重新输入");
                h = false;
        }
        }

    }
}
