package example2;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];//创建类数组
        Goods g1 = new Goods("001","华为p40",5999.0,100);
        Goods g2 = new Goods("002","保温杯",277.0,100);
        Goods g3 = new Goods("003","枸杞",12.7,100);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
