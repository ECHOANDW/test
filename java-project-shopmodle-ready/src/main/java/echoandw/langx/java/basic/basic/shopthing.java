package echoandw.langx.java.basic.basic;

import java.util.Scanner;

public class shopthing {
    public static void main(String[] args) {
        boolean h = true;
        int all = 0;
        String bianhao1 = null;
        int bianhao = 0;
        Scanner x = new Scanner(System.in);
        while (h){

        System.out.println("请选择要购买的商品编号");
            System.out.println("1.T恤衫\n\n2.网球鞋\n\n3.网球拍");
            System.out.println("*******************************");
        System.out.println("请输入商品编号:");
         bianhao = x.nextInt();
        boolean h1 = true;
        while (h1 == true){
            h1 = false;
        switch (bianhao){
            case 1 :
                bianhao = 245;  bianhao1 = "T-恤";h1 = false;break;
            case 2 :
                bianhao = 300; bianhao1 ="网球鞋";h1 = false;break;
            case 3 :
                bianhao = 320; bianhao1 ="网球拍";h1 = false;break;
            default:
                System.out.println("输入错误,请重新输入");h1 = true;
        }
        }
        System.out.println("请输入购买数量:");
        int mun = x.nextInt();
        int heji = mun*bianhao;
        System.out.print(bianhao1+"价格"+bianhao+"\t\t数量"+mun+"\t\t合计¥"+heji);
        all += heji;
        System.out.println("是否继续(y/n)");
        String iff = x.next();
        char o1 = iff.charAt(0);
        switch (o1){
            case 'y': break;
            case 'n':h = false;break;
            default:System.out.println("输入错误,请重新输入");break;}

        }
        double zhekou = 0.8;
        double should = zhekou*all;
        System.out.println("请输入付款金额");
        double shifu = x.nextDouble();
        System.out.println("应付金额"+should);
        System.out.println("实付金额"+shifu);
        double zhao =  shifu - should;
        if (zhao <0){
            System.out.println("去死吧穷逼");
        }else{
            System.out.println("找零"+zhao);
        }

    }
}
