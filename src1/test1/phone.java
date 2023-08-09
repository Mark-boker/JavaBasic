package test1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class phone {//javabean类
    //属性
    String brand;
    double price;

    //手机行为
    public void call(){
        System.out.println("手机在打电话");
    }
    public void playGame(){
        System.out.println("手机在打游戏");
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}
