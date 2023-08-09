package API;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Object o = new Object();
        String str1 = o.toString();//默认获取地址值
        System.out.println(str1);
        //默认隐藏str.toString()，如果创建的类中方法重写toString()就可以不会输出父类object的获取地址值
        //equals方法也是没重写就是比较地址值
    }

}
