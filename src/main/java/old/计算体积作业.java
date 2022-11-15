package old;

import java.util.Scanner;

public class 计算体积作业 {
    public static void main(String[] args) {
        System.out.println("欢迎使用圆柱体积计算公式,请输入半径和高");
        Scanner x = new Scanner(System.in);
        double R = x.nextDouble();
        double h = x.nextDouble();
        double P = Math.PI;
        double s = Math.pow(R,2) * P;
        double vol = s * h;
        System.out.println("圆柱的面积是"+ s);
        System.out.println("圆柱的体积是"+ vol);

    }
}
