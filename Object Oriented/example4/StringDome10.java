package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome10 {
    public static void main(String[] args) {
        String id="321281202001011234";//身份证格式号码
        //年月日
        String year =id.substring(6,10);
        String month =id.substring(10,12);
        String day =id.substring(12,14);
        char gender =id.charAt(16);

        System.out.println("人物信息为：");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
        int num =gender-48;
        if (num%2==0) {
            System.out.println("性别为女");

        }else {System.out.println("性别为男");}
    }



}
