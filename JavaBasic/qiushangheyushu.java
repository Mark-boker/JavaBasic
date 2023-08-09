package JavaBasic;

import java.util.Random;
import java.util.Scanner;


public class qiushangheyushu {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入2个整数: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
//        System.out.println("您输入 " + number1+"\t"+number2);

//        method01(number1,number2);
//          method02(number1);
        method02(9);
        extracted(number1, number2);

    }

    private static void extracted(int number1, int number2) {//22数之间的质数
        int count = 0;
        boolean flag = true;
        for (; number1 <= number2; number1++) {
            for (int i = 2; i <= Math.sqrt(number2); i++) {


                if (number1 % i == 0) {
                    flag = false;
                    break;

                }
            }
            if (flag) {
                System.out.println(number1 + "是质数");
                count++;

            }

        }
        System.out.println(count);
    }


    static void method01(int num1, int num2) {//不用/求商
        int num = 0;
        do {
            num1 = num1 - num2;
            num++;

        } while (num1 >= num2);
        System.out.print("输出商和余数" + num + "\t" + num1);
    }


    static void method02(int num1) {//求质数
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num1); i++) {
            if (num1 % i == 0) {
                flag = false;
                System.out.println(num1 + "不是是质数");
                return;
            }

        }
        System.out.println(num1 + "是质数");
//        if (flag){
//            System.out.println(num1+"是质数");
//        }else {System.out.println(num1+"不是是质数");}
    }

    static void method03() {
        Random r = new Random();
        int nu = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("输入1个整数: ");
            int number = sc.nextInt();
            if (nu == number) {
                System.out.println("猜中了");
                return;
            } else if (nu > number) {
                System.out.println("猜小了");
            } else if (nu < number) {
                System.out.println("猜大了");
            }
        }
    }
}
