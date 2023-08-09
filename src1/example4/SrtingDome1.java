package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class SrtingDome1 {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2="abc";
        String s3="Abc";
        //比较是串池地址和堆内存地址，肯定为false
        System.out.println(s1==s2);
//比较内容，==只是作用于基本数据类型的变量，equals方法，比较的是是否是同一个对象
        boolean result =s1.equals(s2);
        System.out.println(result);
//比较内容，忽略大小写(英文状态)
        boolean result1 =s1.equalsIgnoreCase(s3);
        System.out.println(result1);
    }
}
