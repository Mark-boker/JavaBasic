package extendExample1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Student extends Person{

    //子类所有构造方法默认访问父类无参构造方法，再执行自己
    public Student() {
        super();
        System.out.println("子类无参构造方法");
    }
//父类有参构造方法必须手动写super调用
    public Student(String name,int age) {
super(name,age);
    }


    }


















