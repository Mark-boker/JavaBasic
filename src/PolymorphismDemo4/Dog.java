package PolymorphismDemo4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //行为

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗抱住"+something+"猛吃");//age父类私有
    }
}
