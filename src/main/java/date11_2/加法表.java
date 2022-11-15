package date11_2;

import java.util.Scanner;

public class 加法表 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入一个值");
        int num = x.nextInt();
        System.out.println("加法表");
        int i = 0;
        for (;i <= num;i++){
            int c = num - i;
            System.out.println(i +"+"+c+"="+num);
        }
    }
}
