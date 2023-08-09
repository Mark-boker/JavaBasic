package JavaBasic;

import java.util.Scanner;


public class huiwshu {
    public static void main(String[] args) {
//        while (true){
        Scanner input = new Scanner(System.in);

        System.out.print("输入一个整数: ");
        int number = input.nextInt();
        System.out.println("您输入 " + number);
        int num = 0;
        int g = number;
        while (g != 0) {
            int ge = g % 10;
            g = g / 10;
            num = num * 10 + ge;
        }
//        double a=1d/10;
//        System.out.println(a);
        System.out.println("输出" + num);
        System.out.println(number == num);

//    }
    }
}
