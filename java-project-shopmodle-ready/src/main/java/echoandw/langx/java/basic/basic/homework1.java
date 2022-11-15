package echoandw.langx.java.basic.basic;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        System.out.println("请输入姓名");
        Scanner x =new Scanner(System.in);
                String name = x.next();
                if (name != null ){
                    System.out.println("请输入年龄");
                    byte age =x.nextByte();
                    if (age != -1){
                        System.out.println("请输入身高");
                        float hight = x.nextFloat();
                        if (hight != -1){
                            System.out.println("-------------------------");
                            System.out.println("姓名"+name+"\t"+"年龄"+age+"\t"+"身高"+hight);
                        }
                    }

                }
    }
}
