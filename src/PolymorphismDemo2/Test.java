package PolymorphismDemo2;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Test {
    public static void main(String[] args) {
        //Animal a类型，父类去调用父类的name，引用变量识别运行父类成员变量
Animal a =new Dog();
//调用成员变量：编译看左边运行也看左边
        //编译看左边：java编译代码时候，会看左边的父类有没有这个变量，有，编译成功，如果没有编译失败
        //运行也看左边:java运行代码的时候，实际获取的左边父类成员变量的值

        System.out.println(a.name);
        //调用成员方法：编译看左边 运行看右边
        //编译看左边：java编译代码时候，会看左边的父类有没有这个方法，有，编译成功，如果没有编译失败
        //运行看右边:java运行代码的时候，实际运行子类方法
        a.show();//a对象是狗，只会调用狗类虚方法表中该方法，该方法已经重写覆盖，如果没有重写就调用父类方法

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
}

class Cat extends Animal {
    @Override
    public void show() {
        System.out.println("猫show");
    }
}