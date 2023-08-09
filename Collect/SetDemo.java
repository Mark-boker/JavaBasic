package Collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class SetDemo {
    public static void main(String[] args) {
//HashSet,     TreeSet字符数据ASCII表数字升序排序
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(2);
        //迭代器
       Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);

        }
        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }
        ts.forEach( i-> {System.out.println(i);});




    }



}
