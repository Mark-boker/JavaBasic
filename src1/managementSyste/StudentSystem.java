package managementSyste;

import example5.Phone;
import example5.User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StudentSystem {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            //用输出语句完成主界面
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            //用Scanner录入信息
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            //用Switch语句完成选择
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);   //JVM退出，即Java虚拟机退出
            }
        }

    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
//        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            String sid = sc.nextLine();

            boolean flag = contains(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用！请重新输入：");
            } else {
                s.setSid(sid);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        s.setName(name);
        System.out.println("请输入学生年龄：");

        int age = Integer.parseInt(sc.nextLine());
        s.setAge(age);
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        s.setAddress(address);

        array.add(s);
        System.out.println("学生信息添加成功");
        System.out.println();

    }


    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("当前无学生信息");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t居住地");
        traverse(array);
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();

        int index = getindex(array, sid);
        if (index >= 0) {
            array.remove(index);
            System.out.println("删除" + sid + "的学生成功！");
        } else {
            System.out.println("该信息不存在！");
        }

    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生的学号：");
        String sid = sc.nextLine();
        int index = getindex(array, sid);
        if (index == -1) {
            System.out.println("该学生信息不存在！");
        }
        Student s = array.get(index);

        while (true) {
            System.out.println("1.姓名修改");
            System.out.println("2.年龄修改");
            System.out.println("3.居住地修改");
            System.out.println("4.退出");
            String line = sc.nextLine();

            if (line.equals("4")) {
                break;
            }
            switch (line) {
                case "1":
                    System.out.println("请输入学生姓名：");
                    String newName = sc.nextLine();
                    s.setName(newName);
                    break;
                case "2":
                    System.out.println("请输入学生年龄：");
                    int newAge = Integer.parseInt(sc.nextLine());
                    s.setAge(newAge);

                    break;
                case "3":
                    System.out.println("请输入学生居住地：");
                    String newAddress = sc.nextLine();
                    s.setAddress(newAddress);
                    break;
            }
        }


    }

    public static boolean contains(ArrayList<Student> array, String sid) {
//        for (int i = 0; i < array.size(); i++) {//遍历方便调价
//            Student s = array.get(i);
//            String id = s.getSid();
//            if (id.equals(sid)) {
//                return true;
//            }
//        }
        return getindex(array, sid) >= 0;
    }

    public static int getindex(ArrayList<Student> array, String id) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(id)) {
                return i;
            }

        }
        return -1;
    }

    private static void traverse(ArrayList<Student> getstudentinfo) {
        for (int i = 0; i < getstudentinfo.size(); i++) {//遍历方便调价
            Student s = getstudentinfo.get(i);
            System.out.println(s.getSid() + "\t" + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }
}
