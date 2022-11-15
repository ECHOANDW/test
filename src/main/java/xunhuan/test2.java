package xunhuan;

public class test2 {
    public static void main() {
        int l = 0;
        for (int i = 2; i <= 100; i++) {
            boolean h = true;
            for (int m = 2; m < i; m++) {
                if (i % m == 0) {
                    h = false;
                }

            }
            if (h == true) {
                System.out.print(i + " ");
                l++;
                if (l == 5) {
                    System.out.println("\r");
                    l = 0;
                }
            }
        }
    }
}

