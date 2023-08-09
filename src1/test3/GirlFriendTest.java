package test3;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
//        girlFriend.name="luxi";
//        girlFriend.gender="萌妹子";
//        girlFriend.age=20;
//        girlFriend.setAge(20);
        girlFriend.setName("luxi");
       girlFriend.setGender("女");
        System.out.println(girlFriend.getName());
        System.out.println(girlFriend.getAge());
        System.out.println(girlFriend.getGender());
        girlFriend.eat();

        System.out.println("=====================================");

        GirlFriend girlFriend1 = new GirlFriend();
//        girlFriend1.name="mimi";
//        girlFriend1.age=23;
        girlFriend1.setGender("萌妹子");
        girlFriend1.setName("mimi");
        girlFriend1.setAge(23);
        System.out.println(girlFriend1.getName());
        System.out.println(girlFriend1.getAge());
        System.out.println(girlFriend1.getGender());
        girlFriend1.sleep();
    }
}
