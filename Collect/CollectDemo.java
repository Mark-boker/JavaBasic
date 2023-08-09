package Collect;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class CollectDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        Iterator<String> it = coll.iterator();//迭代器创建指针
        while (it.hasNext()){//判断是否有元素
            String str = it.next();//next方法，获取元素并且移动指针
//            if ("bbb".equals(str)) {
//                it.remove("bbb");//不能用集合删除和添加，只能用迭代器的方法删除但是不能添加
//            }
            System.out.println(str);
        }
    }
}
