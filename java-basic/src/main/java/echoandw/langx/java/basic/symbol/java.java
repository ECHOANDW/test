package echoandw.langx.java.basic.symbol;

public class java {
    public static void main(String[] args) {
        int dividend = 7;
        int divisor = -3;
        int m = 0;
        int i = 0;
        int b = (int) (Math.abs(dividend));
        int c = (int) (Math.abs(divisor));
        if (dividend == divisor) {
            m = 1;
        }

        else if (b<c){
            m = 0;
        }



        else if (dividend > 0 && divisor > 0) {

            if (dividend > divisor) {

                for (; ; i++) {
                    dividend = dividend - divisor;
                    if (dividend < 0) {
                        break;
                    }
                }
                m = i;
                System.out.println(m);
            }

        }
        else if (dividend < 0 && divisor > 0) {
             i = 0;
            for (; ; i++) {
                dividend = dividend + divisor;
                if (dividend > 0) {
                    break;
                }
            }
            m = ((i - 1) - 2 * (i - 1));
        }
        else if (dividend > 0 && divisor < 0) {
            i = 0;
            for (; ; i++) {
                dividend = dividend + divisor;
                int a = (int) (Math.abs(divisor));
                if (dividend < a) {
                    m = 0;
                }
                if (dividend < 0) {
                    break;
                }
            }
            m = ((i - 1) - 2 * (i - 1)); System.out.println(m);
        }
       else if (dividend < 0 && divisor < 0) {

            if (b > c) {
               i = 0;
                for (; ; i++) {
                    b = b - c;
                    if (b < 0) {
                        break;
                    }
                }
                m = i;
            }



        }System.out.println(m);
    }
}