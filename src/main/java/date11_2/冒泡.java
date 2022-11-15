package date11_2;

public class 冒泡 {
    public static void main(String[] args) {
        int a[] = new int[]{4,5,6,4,54,78,68,12,24};
        for (int i = 0;i<a.length-1;i++){
            for (int m = 0;m<a.length-1;m++){
                if (a[m]>=a[m+1]){
                    int temp = a[m];
                    a[m]=a[m+1];
                    a[m+1]=temp;
                }
            }
        }
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
