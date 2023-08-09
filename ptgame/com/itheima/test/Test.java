package com.itheima.test;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Test {
    public static void main(String[] args) {
        int[] arrTemp = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[][] newArr = new int[4][4];
        Random r = new Random();

        for (int i = 0; i < arrTemp.length; i++) {
            int num = r.nextInt(arrTemp.length);
            int temp = arrTemp[i];
            arrTemp[i] = arrTemp[num];
            arrTemp[num] = temp;
        }

//       int count =0;
//        for (int i = 0; i < newArr.length; i++) {
//            for (int j = 0; j < newArr[i].length; j++) {
//                newArr[i][j] = arrTemp[count];
//                count++;
//            }
//        }
        for (int i = 0; i < arrTemp.length ; i++) {
            newArr[i/4][i%4]= arrTemp[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + ",");
            }
            System.out.println();
        }

    }
}
