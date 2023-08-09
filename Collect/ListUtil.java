package Collect;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ListUtil {
    public static<E> void addAll(ArrayList<E>list,E...e){
        for (E element:e)
        {list.add(element);

        }
    }
public void show(){
    System.out.println("尼古拉斯凯奇，阿玮");
}
}
