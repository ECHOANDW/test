package date11_2;

import java.util.Scanner;

public class 年龄占比百分率 {
    public static void main(String[] args) {
   int a[] = new int[100000];
        Scanner x = new Scanner(System.in);
        int i = 0;
        System.out.println("请输入值,输入0结束");
        for(;;i++){
            a[i]= x.nextInt();
            if(a[i]==0){
                break;
            }

        }
        int xiao30 = 0;
        int da30 = 0;
        for(int m = 0;m<(i);m++){
            if (a[m]<=30){
                xiao30 += 1 ;
            }else {
                da30 += 1;
            }
        }
        System.out.println(xiao30);
        System.out.println(da30);
        System.out.println(i);
         double above = (double) da30/(double)i*100;
        double below = (double)xiao30/(double)i*100;
        System.out.println("30以下的比例是"+above+"%");
        System.out.println("30以下的比例是"+below+"%");
    }
}
