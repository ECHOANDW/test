package old;

import java.lang.module.FindException;
import java.net.BindException;
import java.util.Scanner;

public class 重构字符 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String z = x.next();
        char y = z.charAt(0);
        char f = (char)(y -  32);
        System.out.println(z);
        System.out.println(f);





    }
}
