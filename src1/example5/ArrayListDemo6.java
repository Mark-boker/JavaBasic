package example5;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
Phone p1 =new Phone("小米",1000);
        Phone p2 =new Phone("苹果",8000);
        Phone p3 =new Phone("华为",5700);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        getPhoneInfo(list);
//        System.out.println(getPhoneInfo1(list));
        ArrayList<Phone> getPhoneInfo =getPhoneInfo1(list);
        traverse(getPhoneInfo);
    }

    private static void traverse(ArrayList<Phone> getPhoneInfo) {
        for (int i = 0; i < getPhoneInfo.size(); i++) {//遍历方便调价
            Phone p = getPhoneInfo.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }
    }

    public static void getPhoneInfo(ArrayList<Phone> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                System.out.println(list.get(i).toString());

            }
        }
    }
    public static ArrayList<Phone> getPhoneInfo1(ArrayList<Phone> list) {
        ArrayList<Phone> resultList =new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p =list.get(i);
            if (p.getPrice() > 3000) {
//                System.out.println(list.get(i).toString());
                resultList.add(p);

            }
        }
        return resultList;
    }
}
