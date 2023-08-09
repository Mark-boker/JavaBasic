package example5;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Phone {//javabean类
    //属性
    String brand;
    double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

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

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{brand = " + brand + ", price = " + price + "}";
    }
}
