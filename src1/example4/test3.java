package example4;

import java.util.Random;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class test3 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] c = str.toCharArray();
        c = charsRandom(c);
        String result = new String(c);
        System.out.println(result);

    }

    public static char[] charsRandom(char[] a) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            int j = r.nextInt(a.length);
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        return a;

    }
}
