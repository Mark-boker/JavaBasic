package PolymorphismDemo1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Administer extends Person{
    @Override
    public void show() {
        System.out.println("管理员的信息为"+getName()+","+getAge());
    }
}
