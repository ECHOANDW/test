package echoandw.langx.java.basic.array;

public class 二分查找 {
    public static void main(String[] args) {
        int a[] = new int[]{4,5,6,4,54,78,68,12,24};
        int find = 68;
        int head = 0;
        int tail = a.length - 1;
        while (head <= tail)
        {int middle = (head + tail)/2;
            if (a[middle] == find ){
                System.out.println("已找到元素,位置为"+middle);break;
            }
            else if (a[middle]< find){head = middle +1;}
            else if (a[middle]> find){tail = middle - 1;}
        }

    }
}
