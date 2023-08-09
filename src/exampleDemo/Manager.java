package exampleDemo;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class Manager extends Employee{
    private double bouns;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("发工资");
    }
}
