package test3;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class GirlFriend {
    private String name;
    private int age;//private关键字只能在本类使用修改age
   private String gender;

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //左边是成员变量，右边name测试类调用方法获取的变量，就近原则
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 50) {
            this.age = age;

        } else {
            System.out.println("非法数据");

        }

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

