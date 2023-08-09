package API;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class SystemDemo {
    public static void main(String[] args) {
        long l =System.currentTimeMillis();//统计不同程序的运行时间
        System.out.println(l);
 int[] arr1={1,2,3,4,5,6};
 int[] arr2 =new  int[6];
 System.arraycopy(arr1,0,arr2,2,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]+" ");
        }
    }
}
