package Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class CollectDemo2 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(1,"qq");//索引后移


        System.out.println(list.set(1,"qqq"));//修改指定索引元素，并且返回

        System.out.println(list.get(0));//返回指定元素
        //列表迭代器，遍历的过程中可以添加元素
        ListIterator<String> it =list.listIterator();
        while (it.hasNext()){
            String str = it.next();//指针指向下个元素
            if ("bbb".equals(str)){//在指定元素后添加
                it.add("ggg");
            }
        }
        System.out.println(list);





        List<Integer> list1 =new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(3);
        //方法重载，优先调用实参和形参类型一致的方法
        list1.remove(0);
        //System.out.println(list);
        //手动装箱，把基本数据类型1，转换成Integer包装类类型
        Integer i = Integer.valueOf(0);
        list1.remove(i);



    }

}
