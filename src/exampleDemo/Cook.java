package exampleDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
