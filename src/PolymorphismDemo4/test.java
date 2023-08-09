package PolymorphismDemo4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class test {
    public static void main(String[] args) {
        Person p = new Person("老王", 52);
        Dog d = new Dog(2, "黑");
        Cat c = new Cat(3, "白");
        p.keepPet(d, "骨头");
        p.keepPet(c, "鱼");
    }
}
