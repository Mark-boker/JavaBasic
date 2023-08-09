package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDemo {//创建字符串方法

    public static void main(String[] args) {
        String s1 = "abc";//String类已经重写了toString()方法。
        System.out.println(s1);

        String s2 = new String();
        System.out.println("@" + s2 + "!");

        String s3 = new String("abc");
        System.out.println(s3);
//字符串内容是不会改变的，对象创建后不能被改变
        char[] chs = {'a', 'b', 'c', 'd'};//通过传递字符数组就可以修改字符串
        String s4 = new String(chs);
        System.out.println(s4);
//根据字节数组内容创建字符串
        //网络传输数据都是字节信息
        byte[] bytes = {97, 98, 99, 100};//abcd
        String s5 = new String(bytes);
        System.out.println(s5);

    }
}

