package example4;


import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringBuilderDome2 {
    //链式编程，调用一个方法，不需要变量接收他的结果，可以继续调用其他方法
    public static void main(String[] args) {
   int len= getString().substring(1).replace("a","b").length();
        System.out.println(len);
    }
    public  static  String getString(){
        Scanner sc =new Scanner(System.in);
        System.out.println("输入字符串");
        String s1 =sc.next();
        return s1;
    }
}
