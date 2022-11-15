package xunhuan;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("注意,为了方便,输入8848时终止输入,并且种终止的输入与空余的未输入均为0");
        Scanner x = new Scanner(System.in);
        int[] a = new int[100];
        int m = 0;
        int jige = 0;
        int cishu = 0;
        for (int i = 0 ; i < 100;i ++){
            a[i] = x.nextInt();
            cishu++;
            if (a[i]==8848){
                a[i] = 0;
                break;
            }
        }
        int max = a[0];
        for (int i = 0;i <a.length;i++){
          if (a[i]>max){max = a[i];}
        }
        System.out.println("最大值为"+max);

        int min = a[0];
        for (int i = 0;i <a.length;i++){
            if (a[i]<min){min = a[i];}
        }
        System.out.println("最小值为"+min);
        for (int i = 0;i<a.length;i++){
            m += a[i];
            if (a[i]%2 != 0){jige +=1;}
        }
        boolean h = false;
        int shuru = x.nextInt();
        for (int i = 0;i<a.length;i++){
            if (a[i]==shuru){
                System.out.println("已发现相同的数值");
                h = true;
            }
        }
        if (h = false){
            System.out.println("对不起,未发现相同的数值");
        }
        Arrays.sort(a);
        System.out.println("排序后的数组为");
       for (int i = 0;i<a.length;i++){
         System.out.println(a[i]+" ");
        }


    }
}
