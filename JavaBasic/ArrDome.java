package JavaBasic;

import java.util.Random;


public class ArrDome {

    public static  void  main(String[] args){
    int[] arr =new int[]{1,2,3,66,44,68,77,95,12,42};//arr存放地址值，为引用数据类型，如果两个数组同一地址值，修改地址内存放数据导致都会改变

    int number=arr[2];

//        System.out.println(number);
//        System.out.println(arr.length);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("\n");
String[] name =new  String[50];//动态初始化

//m1(arr);
//        m2();
m4(arr);
    }
     static void m1(int arr[]) {
        int max=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) {
                max=arr[i];

            }

    }
         System.out.println(max);
    }
    static void m2(){
        int[] arr =new int[10];
        Random random =new Random();
        for (int i = 0; i < arr.length ; i++) {
            int r=random.nextInt(100)+1;
            arr[i]=r;
        }
        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i]);
        }

    }


    static void m3(int arr[]){//倒序
        for (int i = 0,j= arr.length-1; i <j ; i++,j--) {
        int temp =arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    static void m4(int arr[]){//打乱数组
        Random ran =new Random();
        for (int i = 0; i < arr.length ; i++) {
            int r=ran.nextInt(arr.length);
            int temp =arr[i];
            arr[i] =arr[r];
            arr[r]=temp;
        }
        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i]+" ");
        }
    }
}
