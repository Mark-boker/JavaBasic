package example4;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringDome11 {
    public static void main(String[] args) {//敏感词替换
        String talk="TMD,SB";
        String[] arr={"TMD","SB","CNM","MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk =talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
