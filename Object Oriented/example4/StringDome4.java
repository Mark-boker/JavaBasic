package example4;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入字符串");
    String str= sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);//字符串索引
            System.out.println(c);
        }
    }
}
