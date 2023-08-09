package test1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class phoneTest {
    public static void main(String[] args) {
        phone p = new phone();
        //赋值
        p.brand="小米";
        p.price=1999.9;
        //调用方法
        p.call();
        p.playGame();
        System.out.println(p.brand);
        System.out.println(p.price);
    }
}
