package interfaceDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class test {
    public static void main(String[] args) {
        PinpangAthlete pps = new PinpangAthlete("老刘",22);
        System.out.println(pps.getName()+","+pps.getAge());
        pps.learn();
        pps.learnEnglish();
    }
}
