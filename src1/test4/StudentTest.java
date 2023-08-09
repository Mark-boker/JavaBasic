package test4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("小路",22,"男");
  Student student = new Student();//创建对象，虚拟机调用构造方法，给成员变量进行初始化，执行无参构造方法
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        student.setAge(23);
        System.out.println(student.getAge());
    }
}
