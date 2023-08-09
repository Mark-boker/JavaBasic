package example4;
/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome9 {
    public static void main(String[] args) {
String phoneNumber ="13112349468";
 String start=phoneNumber.substring(0,3);//截取，截头不截尾
String end =phoneNumber.substring(7);//截取后四位11-7
        String result=start+"****"+end;
        System.out.println(result);


    }
}
