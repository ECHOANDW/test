package date11_3;

public class 所有偶数和 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 0;i<= 100;i++){
            if (i%2 != 0){continue;}
            else {num +=i;}
        }
        System.out.println(num);
    }
}
