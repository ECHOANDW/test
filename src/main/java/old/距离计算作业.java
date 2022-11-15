package old;

import java.util.Scanner;

public class 距离计算作业 {
    public static void main(String[] args) {
        System.out.println("欢迎使用动力小子版距离计算工具");
        System.out.println("请输入第一个点的坐标x1与x2");
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        int x2 = x.nextInt();
        System.out.println("请输入第二个点的的坐标y1与y2");
        int y1 = x.nextInt();
        int y2 = x.nextInt();
        double F1 = Math.pow(y1-x1,2);
        double F2 = Math.pow(y2-x2,2);
        double F3 = Math.pow(F1+F2,0.5);
                System.out.println("距离计算的结果是"+F3);



    }
}
