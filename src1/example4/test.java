package example4;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class test {
    public static void main(String[] args) {
        while (true) {
            Scanner sc =new Scanner(System.in);
            System.out.println("输入字符串");
            String s1 =sc.next();
            boolean flag =checkStr(s1);
            if (flag) {
                break;
            }else {
                System.out.println("不符合规则，请重新输入");
            }
        }//变罗马数字用查表法，switch ()
    }
    public static boolean checkStr(String str){
        if (str.length() > 9) {
            return  false;

        }
        for (int i = 0; i <str.length() ; i++) {
            char c =str.charAt(i);
            if (c<'0'||c>'9'){
                return false;
            }

        } return true;
    }
}
