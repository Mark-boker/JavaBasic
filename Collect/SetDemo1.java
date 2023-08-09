package Collect;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class SetDemo1 {
    public static void main(String[] args) {
        //o1为添加的元素，o2为表示已经在红黑树存在的元素
        TreeSet<String> ts1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照长度排序
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        ts1.add("c");
        ts1.add("ab");
        ts1.add("df");
        ts1.add("qwer");
        System.out.println(ts1);
    }
}
