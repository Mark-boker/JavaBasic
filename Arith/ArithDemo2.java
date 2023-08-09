package Arith;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArithDemo2 {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//
//        int[] arr =new  int[sc.nextInt()];
//        arr[0]=1;
//        arr[1]=1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        System.out.println(arr[arr.length-1]);
//        int sum =F(sc.nextInt());
//        System.out.println(sum);
//        System.out.println(M(2));

        System.out.println(getCont(4));
    }
    public static int F(int n){

        if (n == 1||n==2) {

         return 1 ;
     }
       return F(n-1)+F(n-2);
 }
    public static int M(int n){//第十天还剩1个
        if (n == 10) {
            return 1;
        }
        return  (M(n+1)+1)*2;
    }
    //动态规划爬楼梯
    public static int getCont(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return getCont(n-1)+getCont(n-2);
    };
}
