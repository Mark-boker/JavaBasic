package interfaceDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    void teach() {
        System.out.println("教篮球");
    }
}
