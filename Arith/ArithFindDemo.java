package Arith;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArithFindDemo {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 5, 7, 3, 6, 5, 7, 65, 77};
        ArrayList<Integer> list = basicSearch(arr, 65);
        ArrayList<Integer> list1 = binarySeach(arr, 1);
        System.out.println(list);
        System.out.println(list1);
        for (Integer s : list) {
            System.out.println(s);

        }
    }

    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                list.add(i);
            }
        }
        return list;
    }

    //二分
    public static ArrayList<Integer> binarySeach(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        int r = arr.length;
        int l = 0;

        while (true) {
            int mid = (r + l) / 2;
            if (r < l) {
                break;
            }
            if (number == arr[mid]) {
                list.add(mid);
                break;
            } else if (number < arr[mid]) {
                r = mid - 1;
            } else if (number > arr[mid]) {
                l = mid + 1;
            }
        }
        return list;
    }
    //插值查找，需要数组分布均匀
    // p = (key - array[l]) / (array[r] - array[l])
    //    n = r - l
    //    idx = int(n * p)
    //斐波那契查找





}
