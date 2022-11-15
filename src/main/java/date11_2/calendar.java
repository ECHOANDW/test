import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        // 接收用户输入
        Scanner input = new Scanner(System.in);
        System.out.println("输入年份和代表该年第一天是周几的数字");
        int year = input.nextInt();
        int day = input.nextInt();

        // 计算指定年份1月1号到每月1.1
        String str_month = "";
        int day_month = 0;
        for (int month = 1; month <= 12 ; month++){
            // 月份天数（不考虑闰年）
            switch (month){
                case 1: {str_month = "January"; day_month = 31;} break;
                case 2: {day += 31; str_month = "Febuary"; day_month = 28;} break;
                case 3: {day += 28; str_month = "March"; day_month = 31;} break;
                case 4: {day += 31; str_month = "April"; day_month = 30;} break;
                case 5: {day += 30; str_month = "May"; day_month = 31;} break;
                case 6: {day += 31; str_month = "June"; day_month = 30;} break;
                case 7: {day += 30; str_month = "July"; day_month = 31;} break;
                case 8: {day += 31; str_month = "Auguest"; day_month = 31;} break;
                case 9: {day += 31; str_month = "September"; day_month = 30;} break;
                case 10: {day += 30; str_month = "November"; day_month = 31;} break;
                case 11: {day += 31; str_month = "October"; day_month = 30;} break;
                case 12: {day += 30; str_month = "December";day_month = 31;}
            }

            // 输出月历表头+分隔横线+周英文简写
            System.out.println("\t\t" + str_month + " " + year);
            System.out.println("—————————————————————————————————");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

            // 判断闰年+month大于等于2则day+1
            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))){
                if (month != 1)
                    day += 1;
                if (month == 2)
                    day_month += 1;
            }

            // 求是周几
            int week_month = day % 7;

            // 输出日历具体内容
            int count = 0;
            for (int m = week_month; m > 0; m--){
                System.out.print("\t");
                count++;
            }
            for (int i = 1; i <= day_month;i++){
                count++;
                System.out.print(i + "\t");
                if (count % 7 == 0)
                    System.out.println();
            }

            // 输出日历与日历之间的分隔
            System.out.println("\n\n");
        }
    }
}
