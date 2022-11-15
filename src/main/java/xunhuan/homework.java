package xunhuan;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        int j = 0;
        Scanner x = new Scanner(System.in);
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = x.nextInt();
            if (a[i] == 0) {
                j = i - 1;
                break;
            }
        }
        int o = 0;//正数数
        int u = 0;//负数数
        int sum = 0;//和
        int aver = 0;//平均
        for (int k = 0; k <= j; k++) {
            sum += a[k];
            aver = sum / j;
            if (a[k] < 0) {
                o++;
            } else if (a[k] > 0) {
                u++;
            }
        }
        System.out.println("正数个数" + o);
        System.out.println("负数个数" + u);
        System.out.println("和" + sum);
        System.out.println("平均数" + aver);



    }



}


