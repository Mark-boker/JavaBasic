package newexample2;

import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class CarTest {
    public static void main(String[] args) {

        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < arr.length+1; i++) {

            //创建对象，不能在循环外创建，不然c指向的堆地址只有一个，而不是3个对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入第" + i + "辆车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入第" + i + "辆车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入第" + i + "辆车的颜色");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组中，c记录的是堆空间开辟的地址，传过去的是堆空间开辟的地址
            arr[i-1] = c;
        }
        //3.遍历
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }


}


