package old;

import java.text.DecimalFormat;

public class 银行利率 {
    public static void main(String[] args) {
        double kr = 100;
        double lilv = 1.00417;
        for (int i = 1; i <= 6; i++) {
            if (i == 1) {
                kr = kr * lilv;
                System.out.println("第" + i + "年您当前的存款额度为" + new DecimalFormat("0.000").format(kr));

            } else {
                kr = (kr + 100) * lilv;
                System.out.println("第" + i + "年您当前的存款额度为" +  new DecimalFormat("0.000").format(kr));

            }
        }
    }
}