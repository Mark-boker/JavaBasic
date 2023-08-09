package interfaceDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    abstract void teach();
}
