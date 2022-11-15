package date11_3;

import java.util.Scanner;

public class 石头剪刀布 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("0剪刀,1石头,2布");
            int x = (int) (Math.random() * (2 - 0 + 1));
            Scanner z = new Scanner(System.in);
            int num = z.nextInt();
            int fu = num - x;
            switch (fu) {
                case 0:
                    System.out.println(x);
                    System.out.println("平局");break;
                case -1:
                    System.out.println(x);
                    System.out.println("输了");break;
                case -2:
                    System.out.println(x);
                    System.out.println("赢了");break;
                case 2:
                    System.out.println(x);
                    System.out.println("输了");break;
                case 1:
                    System.out.println(x);
                    System.out.println("赢了");break;
            }
        }

    }
}
