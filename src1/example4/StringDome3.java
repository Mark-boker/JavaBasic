package example4;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome3 {
    public static void main(String[] args) {

        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        for (int i = 0; i < 3; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入用户名");
            String username = sc.next();
            System.out.println("输入密码");
            String password = sc.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
break;
            } else {
                System.out.println("用户登录失败"+"您还剩"+(2-i)+"次");
                i++;
                if (i == 3) {
                    System.out.println("您已经登录3次失败，请十分钟后登录");
                    break;
                }
            }
        }

    }
}