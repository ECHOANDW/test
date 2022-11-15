package old;

import java.util.Scanner;

public class 某天是星期几的公式 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        for (; ; ) {
            System.out.println("请输入年份");
            int year = x.nextInt();//输入的年份
            System.out.println("请输入月份");
            int m = x.nextInt();
            if (m == 1 || m == 2) {
                m += 12;
                year--;
            }
            int j = (year + 1) / 100;//世纪数
            int k = year % 100;//该世纪的第几年
            System.out.println("请输入该月的第天数");
            int q = x.nextInt();
            int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
            switch (h) {
                case 0:
                    System.out.println("今天是星期六");
                    break;
                case 1:
                    System.out.println("今天是星期天");
                    break;
                case 2:
                    System.out.println("今天是星期一");
                    break;
                case 3:
                    System.out.println("今天是星期二");
                    break;
                case 4:
                    System.out.println("今天是星期三");
                    break;
                case 5:
                    System.out.println("今天是星期四");
                    break;
                case 6:
                    System.out.println("今天是星期五");
                    break;
            }
        }
    }
}