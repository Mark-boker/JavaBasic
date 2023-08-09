package JavaBasic;

import java.util.Random;
import java.util.Scanner;


public class example2 {
    public static void main(String[] args) {

        boolean red = false;

        int[] arr1 = creatNumber();
        System.out.println("========================");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\r");
        System.out.println("========================");
        int[] useinput = useInputNumber();
        extracted(arr1, useinput);
//        for (int i = 0; i < uesinput.length ; i++) {
//            System.out.println(uesinput[i]+" ");
//        }

    }

    private static void extracted(int[] arr1, int[] useinput) {
        int redCount = 0;//统计中奖个数
        int blueCount = 0;
        for (int i = 0; i < useinput.length - 1; i++) {//判断红球
            for (int j = 0; j < arr1.length - 1; j++) {
                if (useinput[i] == arr1[j]) {
                    redCount++;
                    break;
                }
            }

        }
        if (useinput[useinput.length - 1] == arr1[arr1.length - 1]) {
            blueCount++;
        }
        System.out.println(blueCount + "  " + redCount);
        if (blueCount == 1 && redCount == 6) {
            System.out.println("恭喜中奖1000万");

        } else if (blueCount == 0 && redCount == 6) {
            System.out.println("恭喜中奖500万");

        } else if (blueCount == 1 && redCount == 5) {
            System.out.println("恭喜中奖3000");

        } else if ((blueCount == 0 && redCount == 5) || (blueCount == 1 && redCount == 4)) {
            System.out.println("恭喜中奖200");

        }
//        else {
//            System.out.println("恭喜中奖10");
//
//        }
    }

    private static int[] creatNumber() {
        int[] arr1 = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr1.length;) {
            int number = r.nextInt(33) + 1;
            if (!judgeextracted(arr1,number)){
                arr1[i]=number;
                i++;
            }
        }
        arr1[arr1.length - 1] = r.nextInt(16) + 1;
        return arr1;
    }

    private static int[] useInputNumber() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        for (int i = 0; i < 6; ) {
            System.out.println("输入第" + (i + 1) + "红球号码");
            int rednumber = sc.nextInt();
            if (rednumber > 33 || rednumber < 1) {
                System.out.println("超出1-33的范围");
            } else {
                if (!judgeextracted(arr, rednumber)) {
                    arr[i] = rednumber;
                    i++;
                } else {
                    System.out.println("当前红球号码存在");
                }

            }
        }
        while (true) {
            System.out.println("输入蓝球号码");
            int bluenumber = sc.nextInt();
            if (bluenumber >= 1 && bluenumber <= 16) {
                arr[arr.length - 1] = bluenumber;
                break;
            } else {
                System.out.println("蓝球不符合范围");
            }
        }
        return arr;
    }

    private static boolean judgeextracted(int[] arr, int number) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == number) {
                return true;
            }
        }
        return false;
    }
}
