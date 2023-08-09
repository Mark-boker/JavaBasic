package JavaBasic;

import java.util.Random;


public class SnatchBag {//抢红包
    public static void main(String[] args) {//shift+f6同时修改变量名
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int price = arr[i];
           arr[i] = arr[index];
            arr[index]=price;
        }
//        extracted(arr, newArr, r);
        extracted(arr);
    }

    private static void extracted(int[] arr) {  //重载，同个方法名参数不同
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    private static void extracted(int[] arr, int[] newArr, Random r) {
        for (int i = 0; i < arr.length; ) {
            int index = r.nextInt(arr.length);
            int price = arr[index];
            if (flagmethod(newArr, price)) {
                newArr[i] = price;
                i++;
            }
        }
    }

    public static boolean flagmethod(int a[], int price) {
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == price) {
                return flag = false;

            }

        }
        return flag;

    }
}
