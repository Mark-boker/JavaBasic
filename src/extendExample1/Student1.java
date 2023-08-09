package extendExample1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Student1 {
    String name;
    int age;
    String school;

    public Student1() {
        //调用本类其他构造方法
        this(null,0,"xxx大学");
    }

    public Student1(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
