package example4;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome8 {
    public static void main(String[] args) {//金额转换
        Scanner sc = new Scanner(System.in);
        int money = 0;
        while (true) {
            System.out.println("请输入一个数字");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("数字无效，请重新输入");
            }
        }
        String moneystr = "";
        while (money != 0) {
            int num = money % 10;
            String str = getBig(num);
            money = money / 10;
            moneystr = str + moneystr;
        }
        int count = 7 - moneystr.length();
        for (int i = 0; i < count; i++) {
            moneystr = "零" + moneystr;
        }

        System.out.println(moneystr);
        String resMoney = "";
        String[] arr = {"伯", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < moneystr.length(); i++) {
            char c = moneystr.charAt(i);
//            System.out.print(c);
//            System.out.print(arr[i]);
            resMoney = resMoney + c + arr[i];
        }
        System.out.println(resMoney);
    }

    public static String getBig(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}

