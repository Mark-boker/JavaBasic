package test4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Student {
    private String name;
    private int age;//private关键字只能在本类使用修改age
   private String gender;

   public Student(){
       System.out.println("执行的是无参数构造方法");//无参数构造方法

}//构造方法重载
    public Student(String name, int age, String gender){//无参数构造方法
this.name=name;
this.age=age;
this.gender=gender;
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

