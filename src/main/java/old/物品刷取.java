package old;

public class 物品刷取 {
    public static void main(String[] args) {
        System.out.println("******************消费单******************");
        System.out.println("购买物品\t\t单价\t\t数量\t\t价格");
        System.out.println("T恤\t\t\t\t$245\t\t2\t\t$490");
        System.out.println("T恤\t\t\t\t$570\t\t1\t\t$570");
        System.out.println("网球鞋\t\t\t$320\t\t1\t\t$320");
        System.out.println("折扣:\t\t\t8折");
      int a = 245;
        int b = 570;
        int c = 320;
        double F = (double)(a*2+b+c);
System.out.println("消费总金额"+(F * 0.8));
        System.out.println("实际交费"+1500);
        System.out.println("找钱"+396);
        System.out.println("本次购物获得的总积分为"+33);




    }
}
