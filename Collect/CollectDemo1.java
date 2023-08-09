package Collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class CollectDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        //增强for,集合名字加for,修改第三方变量不会修改集合原本的数据
        for (String s : coll) {
            System.out.println(s);
        }
        //lambda遍历
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        coll.forEach((s) -> {System.out.println(s);});
    }
}
