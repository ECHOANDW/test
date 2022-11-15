package old;

public class test {
    public static void main(String[] args) {


        int i = 0;//位数
        int x = 123123;
        int o = x;
        if (o == 0) {
            i = 1;
        }
        for (; x > 0; i++) {
            x = x / 10;
        }

        int f = i / 2;
        for (int m = 1; m <= f; m++) {
            int m1 = (int) (Math.pow(10, (i - m)));//左位的10的0数
            int m2 = (int) (Math.pow(10, (m - 1))); //右边位的0数
            System.out.println(m1);
          
            int zuo = o / m1 % 10;
            int you = o / m2 % 10;
            if (zuo == you) {
                System.out.println(1);
            }

        }
    }
}







