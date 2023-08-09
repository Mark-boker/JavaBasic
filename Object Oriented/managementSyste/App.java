package managementSyste;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */

public class App {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");

            String choose = sc.next();
            switch (choose) {
                case "1" : login(list);
                case "2" : register(list);
                case "3" : forgetPassword(list);
                case "4" : {
                    System.out.println("退出");
                    System.exit(0);
                }
                default : System.out.println("没有这个选项");
            }
        }
    }
    private static void forgetPassword(ArrayList<User> list) {}
    private static void register(ArrayList<User> list) {}
    private static void printList(ArrayList<User> list) {}
    // 检验手机号码
    private static boolean checkPhoneNumber(String phoneNumber) {}
    // 检验身份证号码
    private static boolean checkPersonId(String personID) {}
    // 检验用户名格式判断
    private static boolean checkUsername(String username) {}
    // 登录
    private static void login(ArrayList<User> list) {}
    // 检验登录
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {}
    // 生成验证码
    private static String getCode() {}
    // 检验唯一性
    private static boolean contains(ArrayList<User> array, String username) {
        return getindex(array, username) >= 0;
    }

    private static int getindex(ArrayList<User> array, String username) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getUsername().equals(username)) {
                return i;
            }

        }
        return -1;
    }

}
