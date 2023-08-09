package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome7 {
    public static void main(String[] args) {

        String str = "abcde";
//        String str1=reverser(str);
        str =reverser(str);
        System.out.println(str);
    }

    public static String reverser(String str) {//字符串反转
        String result = "";
        for (int length = str.length()-1; length >= 0; length--) {
            char c = str.charAt(length);
            result = result + c;
        }
        return result;

    }
}
