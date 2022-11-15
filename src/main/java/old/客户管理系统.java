package old;

import java.util.Scanner;

public class 客户管理系统 {
    public static void main(String[] args) {
        System.out.println("登陆菜单");
        System.out.println("1.登陆系统");
        System.out.println("2.退出");
        Scanner x = new Scanner(System.in);
        int input = x.nextInt();
        switch (input) {
            case 1:
                System.out.println("1.客户端信息管理");
                System.out.println("2.购物结算");
                System.out.println("3.真情回顾");
                System.out.println("4.注销");

                int input1 = x.nextInt();
                switch (input1) {
                    case 1:
                        System.out.println("1.显示所有客户信息");
                        System.out.println("2.添加客户信息");
                        System.out.println("3.修改客户信息");
                        System.out.println("4.查询客户信息");

                        break;
                    case 2:
                        System.out.println("暂未装载");
                        break;
                    case 3:
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                    case 4:
                        System.out.println("已注销");
                        break;
                }
        }
    }
}