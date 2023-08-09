package interfaceDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class PinpangCoach extends Coach implements English{
    public PinpangCoach() {
    }

    public PinpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    void teach() {
        System.out.println("交打乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语");
    }
}
