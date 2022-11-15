package echoandw.langx.java.basic.array;

public class doublepeekfinder {
    public static int getmax(int[] arr){
        int find = 68;
        int head = 0;
        int tail = arr.length - 1;
       int isflag = 0;
        while (head <= tail)
        {int middle = (head + tail)/2;
            if (arr[middle] == find ){
                isflag = 1;
                System.out.println("已找到元素,位置为"+middle);break;
            }
            else if (arr[middle]< find){head = middle +1;}
            else if (arr[middle]> find){tail = middle - 1;}
        }
return isflag;
    }
}
