package example5;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("点赞了么？");
        list.add("收藏了么？");
        list.add("投币了么？");
        list.add("转发了么？");
        System.out.println(list);

        listExtracted(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
listExtracted(list1);

    }

    private static void listExtracted(ArrayList list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + "，");
            }
        }
        System.out.println("]");
    }
}
