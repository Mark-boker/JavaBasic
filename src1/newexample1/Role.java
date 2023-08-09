package newexample1;

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
    private char gender;
    private String face;
    String[] boyFace = {"器宇轩昂", "相貌平平", "面目狰狞"};
    String[] girlFace = {"沉鱼落雁", "相貌平平", "亭亭玉立"};
    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【黑虎掏心】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    //injured受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果「轰」的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去",
    };



    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("相貌为：" + getFace());
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     *
     * @param face
     */
    public void setFace(char gender) {
        this.gender=gender;//直接在setFace可以修改性别
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyFace.length);
            this.face = boyFace[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlFace.length);
            this.face = girlFace[index];
        } else {
            this.face = "面目狰狞";
        }
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
        int index =r.nextInt(attacks_desc.length);
        String kongFu =attacks_desc[index];
        System.out.printf(kongFu,this.getName(),role.getName());
        int att = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - att;
        remainBlood= remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        //受伤描述
        //血量>90 0索引描述
        //80~90 1索引描述
        //70~80 2索引描述
        //60~70 3索引描述
        //40~60 4索引描述
        //20~40 5索引描述
        //10~20 6索引描述
        //血量小于10 7索引描述

        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood > 80 && remainBlood <= 90) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (remainBlood > 70 && remainBlood <= 80) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (remainBlood > 60 && remainBlood <= 70) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (remainBlood > 40 && remainBlood <= 60) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (remainBlood > 20 && remainBlood <= 40) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (remainBlood > 10 && remainBlood <= 20) {
            System.out.printf(injureds_desc[6], role.getName());
        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();

    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }


}
