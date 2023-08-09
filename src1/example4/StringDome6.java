package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome6 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] a) {//拼接字符串
        if (a == null) {
            return "";

        }
        if (a.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                result = result + a[i];
                break;
            }
            result = result + a[i] + ",";

        }
        result = result + "]";
        return result;
    }
}
