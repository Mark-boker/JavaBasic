package PolymorphismDemo1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(21);

        Teacher t = new Teacher();

        t.setName("lisi");
        t.setAge(30);

        Administer a = new Administer();
        a.setName("wangwu");
        a.setAge(21);
        register(s);
        register(t);
        register(a);
    }
//这个方法可以接收三种类型的，只能把参数写成三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
