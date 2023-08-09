package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class test2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
//        String rotate = rotate(strA);
//        System.out.println(rotate);
        boolean result =check(strA,strB);
        System.out.println(result);
    }
    public static boolean check(String strA,String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA =rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }return false;
    }
    public static String rotate(String str) {
    char[] arr=str.toCharArray();//把字符串变为数组
        char first=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];//把第一位换到最后一位
        }
        arr[arr.length-1]=first;
        String result =new String(arr);
        return result;
//        char first = str.charAt(0);
//        String end = str.substring(1);
//        return end + first;
    }
}
