package example5;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 =new Student("zhangsan",23);
        Student s2 =new Student("lisi",24);
        Student s3 =new Student("wangwu",21);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Student stu =list.get(i);
            System.out.println(stu.toString());
        }
    }
}
