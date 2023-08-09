package Arith;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArithDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数转换为2进制，输入0退出");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            String s =toBinaryString(number);

            System.out.println(s);

            System.out.println("Integer方法验证:"+Integer.toBinaryString(number));
        }
    }
    public static  String toBinaryString(int number){
        StringBuilder sb =new StringBuilder();
        while (true){
            if (number == 0) {
                break;
            }
            int yu =number%2;
            sb.append(yu);
            number =number/2;
        }
    sb.reverse();//反转得二进制数
    return  sb.toString();}
}
