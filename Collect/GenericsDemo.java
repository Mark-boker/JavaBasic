package Collect;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class GenericsDemo {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(123);

        ArrayList<String> list2 = new ArrayList<>();
        ListUtil.addAll(list2, "1", "2");
        System.out.println(list2);

    }
}
