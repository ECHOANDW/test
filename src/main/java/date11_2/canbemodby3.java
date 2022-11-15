package date11_2;

public class canbemodby3 {
    public static void main(String[] args) {
        int f = 0;
        for (int i = 1;i <=100;i++){
            if (i%3 !=0){
                f += i;
            }
        }
        System.out.println("和为"+f);
    }
}
