package date11_2;

import java.util.Scanner;

public class 随机加减法 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] array = new int[10];
       for (int i = 0;i < array.length;i++){
           array[i] = (int)(Math.random()*100);
       }     int abrr[] = new int[5];
       for (int i = 0;i<5;i++){
           abrr[i] = array[i]+array[i+5];
       }
       long start = System.currentTimeMillis();
       for (int i = 0;i<5;i++){
           System.out.println(array[i]+"+"+array[i+5]+"=");

           int a = x.nextInt();
           String b = null;
           System.out.println(array[i]+"+"+array[i+5]+"="+a+"\t\t\t\t");
           if (a == abrr[i]){ b = "correct";}
           else { b = "wrong";}

           System.out.println(array[i]+"+"+array[i+5]+"="+abrr[i]+"\t\t\t\t"+b);
       }
       long end = System.currentTimeMillis();
        System.out.println("所用时间为"+(int)((end-start)/1000)+"s");
    }
}
