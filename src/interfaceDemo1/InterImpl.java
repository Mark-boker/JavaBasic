package interfaceDemo1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class InterImpl extends InterAdapter{
    //我需要用到哪个方法，就重写哪个方法


    @Override
    public void met2() {
        System.out.println("只用第二个方法");
    }
}
