package interfaceDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class PinpangAthlete extends Athlete implements English{

    public PinpangAthlete() {
    }

    public PinpangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    void learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语");
    }
}
