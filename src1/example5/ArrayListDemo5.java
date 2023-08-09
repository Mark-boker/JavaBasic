package example5;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("001", "zhangsan", "23");
        User u2 = new User("002", "lisi", "24");
        User u3 = new User("003", "wangwu", "21");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println(contains(list, "001"));
        System.out.println(getindex(list, "003"));

    }

    public static int getindex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;

            }

        }
        return -1;
    }

    public static boolean contains(ArrayList<User> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(id)) {
//                return true;
//
//            }
//        }
//        return false;
        return getindex(list, id) >= 0;
    }

}
