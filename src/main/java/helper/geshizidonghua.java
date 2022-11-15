package helper;

import java.util.Scanner;

public class geshizidonghua {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (true) {
            String a = x.next();
            String b = x.next();

            String h = x.next();
            String c = x.next();
            String d = x.next();
            System.out.println("INSERT INTO stu VALUES ('" + a + "'," +"'"+b+"',"+"'"+h+"',"+ "'" + c + "','" + d + "');");
        }
    }
}