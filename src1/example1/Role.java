package example1;

import java.util.Random;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义攻击别人的方法
    public void attack(Role role) {
        Random r = new Random();
        int att = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - att;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "用拳头打了" + role.getName() + "一下，造成了" + att + "伤害," + role.getName()
                + "还剩下" + remainBlood + "血");
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }
}
