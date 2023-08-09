package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringBuilderDome1 {
    public static void main(String[] args) {
        //StringBuilder是java在底层做了处理，打印的对象不是地址属性值
        //toString返回类名和引用地址,将StringBuffer转换成String
        StringBuilder sb =new StringBuilder("abc");
        sb.append(1);
        sb.append(true);

        //长度获取
       int len= sb.length();
        System.out.println(len);
        System.out.println(sb);
      //反转
        System.out.println(sb.reverse());}
}
