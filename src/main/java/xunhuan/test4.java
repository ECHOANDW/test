package xunhuan;

public class test4 {
    public static void main() {
        for (int i = 100;i <= 1000;i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            double k = Math.pow(ge,3);
            double t = Math.pow(shi,3);
            double y = Math.pow(bai,3);
            int m = (int)(k+t+y);
            if (m == i){
                System.out.println(i);
            }
        }
    }
}
