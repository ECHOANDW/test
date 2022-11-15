package date11_3;

import java.util.Scanner;

public class 金字塔 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int z = x.nextInt();
        int k = z ;
        for (int i = 1;i <=z ;i++){
            int f = 1 + 2*(i-1);
            int h = f/2+1;
          for (int l= 1;l<k;l++){
              System.out.print(" ");
          }
            for (int j = i;j>=1;j--){
                System.out.print(j);
            }
            for(int m = 2;m <= i;m++){
                System.out.print(m);
            }
            System.out.println("\r");
            k--;
        }
    }
}
