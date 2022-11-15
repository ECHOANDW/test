package old;

public class 分解数字 {
    public static void main(String[] args) {
        int A = 8681;
                int qian = A/1000;
                int bai1 = A%1000;
                int bai = bai1/100;
                int shi3 = A%1000;
                        int shi2 = A%100;
                                int shi = shi2/10;
                  int ge = shi2%10;
                System.out.println("千位数"+qian);
        System.out.println("百位数"+bai);
        System.out.println("十位数"+shi);
        System.out.println("个位数"+ge);


    }
}
