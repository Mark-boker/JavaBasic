package JavaBasic;

import java.util.Scanner;


public class example1 {
    public static void main(String[] args) {
        fly();

    }

    public static void fly() {//飞机票价
        Scanner p1 = new Scanner(System.in);
        System.out.println("输入飞机票票价");
        int ticket = p1.nextInt();

        System.out.println("输入月份");
        int month = p1.nextInt();

        System.out.println("输入类型，1为经济舱，2为商务舱");
        int seat = p1.nextInt();
        double end = judge(ticket, month, seat);
        System.out.println(end);

    }

    public static double judge(int tic, int mon, int seat) {//ctrl+atl+M自动抽取代码或者refactor找
        double a = 0;
        if (mon >= 5 && mon <= 10) {//旺季
            a = getA(seat, a, tic, 0.85, 0.9);
        } else if ((mon <= 4 && mon >= 1) || (mon <= 12 && mon >= 11)) {
            a = getA(seat, a, tic, 0.65, 0.7);
        }

        return a;
    }

    private static double getA(int seat, double a, int tic, double x, double x1) {
        if (seat == 1) {
            a = tic * x;
        } else if (seat == 2) {
            a = tic * x1;
        } else {
            System.out.println("无");
        }
        return a;
    }
}
