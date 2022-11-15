package echoandw.langx.java.basic.symbol;

public class selffu {
    public static void main(String[] args) {
        int s = 0;//34数记
        for (int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100%10;
            int qian = i /1000%10;
            double ge1 = Math.pow(ge, 4);
            double shi1 = Math.pow(shi, 4);
            double bai1 = Math.pow(bai, 4);
            double qian1 = Math.pow(qian, 4);
            int m = (int) (ge1 + shi1 + bai1+qian1);
            if (m == i) {
                System.out.println(i);
                s++;
            }
        }
        System.out.println("四叶玫瑰数个数为" + s);
         int  k = 0;
        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100%10;
            int qian = i /1000%10;
            int wan = i / 10000%10;
            double ge1 = Math.pow(ge, 5);
            double shi1 = Math.pow(shi, 5);
            double bai1 = Math.pow(bai, 5);
            double qian1 = Math.pow(qian, 5);
            double wan1 = Math.pow(wan, 5);
            int m = (int) (ge1 + shi1 + bai1+qian1+wan1);
            if (m == i) {
                System.out.println(i);
                k++;
            }
        }
        System.out.println("五角星数个数为" + k);
        int f = k + s;
        System.out.println("总数为"+ f);
    }
}
