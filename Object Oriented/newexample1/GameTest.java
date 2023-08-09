package newexample1;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class GameTest {
    public static void main(String[] args) {
        Role r1=new Role("小宝",100, '男');
        Role r2=new Role("小宋",100, '男');
       //代码修改后，可以修改性别
        r2.setFace('女');
r1.showRoleInfo();
r2.showRoleInfo();


                while(true){
            r1.attack(r2);
            if (r2.getBlood()==0){
                System.out.println(r2.getName()+"被KO了");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r1.getName()+"被KO了");
                break;
            }
        }
    }
}
