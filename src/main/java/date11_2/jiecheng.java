package date11_2;

import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int in = x.nextInt();
        int R7 = 1;
        for (int i = 1; i <= in; i++) {
            R7 = R7 * i;
        }
        System.out.println(R7);
    }
}