package JavaBasic;

/**
 * Description:
 * Param:two-dimension array
 * return:
 * Author:boker
 * Date:
 */
public class example3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr1 = {{11, 23, 37},//这样写更清楚
                {42, 54, 16},
                {7, 8, 27},
                {9, 6, 14}};
        int[][] arr2 = new int[3][5];//2行一维数组，一维数组个数为3
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length ; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        double yearsum=0;
        for (int i = 0; i < arr1.length ; i++) {//选中一段代码ctrl+alt+T可添加各种循环判断
            System.out.println("第"+i+"季度营业额为:"+summoney(arr1[i]));//第几个一维数组数组
        yearsum=yearsum+summoney(arr1[i]);
        }
        System.out.println("全年营业额为："+yearsum);

    }
    public static double summoney(int[] a){//一维数组的总和
        double sum=0;
        for (int i = 0; i < a.length ; i++) {
            sum=sum+a[i];
        }
        return sum;
    }
}
