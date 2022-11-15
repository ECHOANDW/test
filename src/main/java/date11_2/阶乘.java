package date11_2;

import java.util.Scanner;

public class 阶乘 {
    public static int recursion(int num) {
        if (num <= 1) {return 1;}
        else {return num * recursion(num - 1);}
    }

    public static void main(String[] args) {
        int result = recursion(5);
        System.out.println(result);
    }
    public static void css(){
        Scanner x = new Scanner(System.in);
        int in = x.nextInt();
        int R7=0;
        for (int i = 1;i<=in;i++){
            R7 = R7*i;
        }
    }
}

