package example5;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建ArrayList对象底层做了一些处理，打印的对象是地址值，而是集合中存储数据内容
        //展示的时候会拿[]把所有的数据进行包裹
        ArrayList<String> list = new ArrayList<>();
//        System.out.println(list);

//        boolean result=list.add("aaa");
        //添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //删除
//        boolean result=list.remove("aaa");
        String str = list.remove(1);

        //修改
        list.set(1, "ddd");
//        System.out.println(list);

        //查询
        String s = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String g=list.get(i);
            System.out.println(g);
        }
    }
}
