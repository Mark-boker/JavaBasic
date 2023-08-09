package exampleDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Test {
    public static void main(String[] args) {
        Manager m =new Manager("001","张三",15000,8000);
        System.out.println(m);
        Cook c = new Cook();
        c.setId("002");
        c.setName("lisi");
        c.setSalary(8000);
        System.out.println(c.toString());
        c.work();
        c.eat();


    }
}
