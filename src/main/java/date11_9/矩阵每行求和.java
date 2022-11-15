package date11_9;

public class 矩阵每行求和 {
    public static void main(String[] args) {
        int a[][]=new int [3][4];
        for(int i= 0;i<a.length;i++){
            for (int m = 0;m<a[i].length;m++){
                int ran = (int) (Math.random() * (100));
                 a[i][m] = ran;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int m = 0; m < a[i].length; m++) {
                System.out.print(a[i][m]+"\t\t");
            }
            System.out.println("\t");
        }int sum = 0;
        for (int i = 0;i<a.length;i++){
            sum = 0;
            for(int m = 0;m<a[i].length;m++){
                sum += a[i][m];
            }
            System.out.println("第"+(i+1)+"行的和为"+sum);
        }
    }
}
