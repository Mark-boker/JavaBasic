package example4;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringBuilderDome3 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc =new Scanner(System.in);
            System.out.println("输入字符串");
            String s1 =sc.next();
//        StringBuilder sb = new StringBuilder();
//        sb.append(s1);
//        sb.reverse();
            String sb = new StringBuilder().append(s1).reverse().toString();
            if (sb.equals(s1)) {
                System.out.println("是对称数组");break;
            }else {System.out.println("不是对称数组");}
        }
//        System.out.println(sb);
    }

    public static String arrToString(int[] a) {//拼接字符串
        StringBuilder sb=new StringBuilder();
        sb.append("[");

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
              sb.append(a[i]);
            }
            sb.append(a[i]).append(",") ;

        }
        sb.append("]");
        return sb.toString();//将StringBuffer转换成String
    }
}
