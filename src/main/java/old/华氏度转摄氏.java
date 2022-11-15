package old;

import java.util.Scanner;

public class 华氏度转摄氏 {
    public static void main(String[] args) {
        System.out.println("请输入当前的华氏度");
        Scanner x = new Scanner(System.in);
        double huashi = x.nextDouble();
        double sheshi = (huashi - 32) / 1.8;
        System.out.println("当前的摄氏度时"+sheshi);
    }
}
