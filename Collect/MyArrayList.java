package Collect;

import java.util.Arrays;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class MyArrayList<E> {//泛型类，E不确定类型，e形参的名字
    Object[] object =new Object[10];
    int size;
    public boolean add(E e){
        object[size]=e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)object[index];
    }
    @Override
    public String toString(){
        return Arrays.toString(object);
    }
}
