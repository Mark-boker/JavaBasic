package managementSyste;

/*
    学生类
 */
public class Student {
    //学号
    private String  sid;
    //姓名
    private String name;
    //年龄
    private int age;
    //居住地
    private String address;

    //构造函数
    public Student(){}
    public Student(String sid, String name, int age, String address){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Alt + insert 可以快速生成这些东西
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{sid = " + sid + ", name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
