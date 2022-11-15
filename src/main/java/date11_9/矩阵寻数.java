package date11_9;

import cn.hutool.json.JSONUtil;

public class 矩阵寻数 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        int a[][] = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int m = 0; m < a[i].length; m++) {
                int ran = (int) (Math.random() * (2));
                a[i][m] = ran;
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int m = 0; m < a[i].length; m++) {
                System.out.print(a[i][m]);
            }
            System.out.println("\t");
        }
        int sum = 0;
        int non = 0;
        int temp = 0;
        int b[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int m = 0; m < a[i].length; m++) {
              sum += a[i][m];
            }
            b[i] = sum;
        }
        non = b[0];
        int xa = 0;
        for (int i = 0;i <b.length;i++){
            if (b[i]>=non ){non = b[i];xa = i;}}
        System.out.println("最多的行为"+(xa+1));
        sum = 0;
        non = 0;
        temp = 0;
        int c[] = new int[4];
        xa = 0;
      for (int i = 0;i<= 3;i++){
          sum = 0;
          for (int m = 0;m<a[i].length;m++){
              sum +=a[m][i];
          }
          c[i]= sum;
      }
      non = c[0];
      for (int i = 0;i <c.length;i++){
          if (c[i]>=non ){non = c[i];xa = i;}
      }
        System.out.println("最多的列为"+(xa+1));
    }
}