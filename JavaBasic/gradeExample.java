package JavaBasic;

import java.util.Arrays;
import java.util.Scanner;


public class gradeExample {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; ) {
            System.out.println("输入评委打分");
            int score=sc.nextInt();
            if (score <= 100 && 0 <= score) {

                arr[i] = score;
                i++;

            } else {
                System.out.println("请输入0-100之间的分数");
            }
        }
        Arrays.sort(arr);
//        for (int i = 0; i <6 ; i++) {
//            System.out.println(arr[i]);
//        }
        double avg = 0;
        for (int i = 1; i < arr.length-1; i++) {
            avg = arr[i] + avg;

        }
        avg = avg / arr.length-2;
        System.out.println("选手最终得分"+avg);
    }
}
