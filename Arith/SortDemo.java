package Arith;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {12, 8, 4, 99, 5, 47, 65, 20, 15};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        //冒泡排序的时间复杂度为O(n*n)
        int temp = 0;//临时变量
        boolean flag = false;//用于优化冒泡排序，判断是否进行过交换
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    //三角交换
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
            //如果没有进入三角交换则证明数组已经有序，直接退出循环即可
            //如果进入了三角交换，把flag赋值为false，来判断下一次循环是否进入三角交换
            if (flag == false) {
                break;
            } else {
                flag = false;
            }
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                }
            }
            // 交换当前索引 i 和最小值索引 minIndex 两处的值
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
        }
    }

    //插入排序
    public static void insertSort(int[] arr) {
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

    }

    //快速排序
    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        //记录基准数


        if (start > end) {
            return;
        }
        int baseNumber = arr[i];
        while (start < end) {
            while (true) {
                //后开始找比基准数小的数字
                if (end < start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            while (true) {
                //后开始找比基准数大的数字
                if (end < start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
           int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //与基准数交换
        int temp = arr[i];
        arr[i]= arr[start];
        arr[start] = temp;
        //基数左边
        quickSort(arr, i, start - 1);
        //基数右边
        quickSort(arr, start + 1, j);
    }


    //递归
    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + getSum(number - 1);
    }

    public static int getFactor(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactor(number - 1);
    }
}
