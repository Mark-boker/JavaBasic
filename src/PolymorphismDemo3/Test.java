package PolymorphismDemo3;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Test {
    public static void main(String[] args) {

    Animal a =new Dog();
   // a.eat();是错误的，编译时候检查父类是否有没有该方法，没有就报错
//转换就可以调用子类独有的方法，对象是不能随便转换成其他类型

//        Dog d =(Dog) a;
//        d.eat();
        //不知道对象类型可以做判断
        if (a instanceof Dog){//或者if (a instanceof Dog d)
            Dog c =(Dog) a;
            c.eat();
        }else if (a instanceof Cat) {//(a instanceof Cat c)
            Cat c=(Cat) a;
            c.sleep();
        }else {
            System.out.println("没有这个类型");
        }
    }
}

class Animal {
    String name ="动物";

    public void show() {
        System.out.println("动物show");
    }
}

class Dog extends Animal {
    String name ="狗";
    int age =10;
    @Override
    public void show() {
        System.out.println("狗show");
    }
    public void eat() {
        System.out.println("狗吃饭");
    }
}

class Cat extends Animal {
    @Override
    public void show() {
        System.out.println("猫show");
    }
    public void sleep() {
        System.out.println("猫睡觉");
    }
}