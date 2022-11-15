package old;

import java.util.Scanner;

public class 三角形面积计算 {
    public static void main(String[] args) {
        System.out.println("请输入三个点的坐标");
        Scanner x = new Scanner(System.in);
        double a1 = x.nextDouble();
        double b1 = x.nextDouble();
        double a2 = x.nextDouble();
        double b2 = x.nextDouble();
        double a3 = x.nextDouble();
        double b3 = x.nextDouble();
        double F1 = Math.pow(a1-a2,2);
        double F2 = Math.pow(b1-b2,2);
        double F3 = Math.pow(F1+F2,0.5);
        double G1 = Math.pow(a1-a3,2);
        double G2 = Math.pow(b1-b3,2);
        double G3 = Math.pow(G1+G2,0.5);
        double H1 = Math.pow(a3-a2,2);
        double H2 = Math.pow(b3-b2,2);
        double H3 = Math.pow(H1+H2,0.5);
        double S = (F3 + G3 + H3)/2;
        double ttt = S*(S-F3)*(S-G3)*(S-H3);
        double mianji = Math.pow(ttt,0.5);
        System.out.println("该三角形的面积为"+ mianji);
    }
}
