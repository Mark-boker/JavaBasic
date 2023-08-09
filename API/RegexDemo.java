package API;

import javax.crypto.Mac;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class RegexDemo {
    public static void main(String[] args) {//pattern,JDK API文档搜索
        //any-rule插件
        String qq ="1234567890";
        String regex1 ="1[3-9]\\d{9}";//  \d{9}数字出现9次
        String regex2 ="0\\d{2,3}-?[1-9]\\d{4,9}";//区号电话号
        //邮箱号
        String regex3="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2}";
        //24小时,12小时
        String regex4="([01]\\d)|2[0-3]):[0-5]\\d:[0-5]\\d";
        String regex5="(^\\d{8}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}$)|(^\\d{6}(18|19|20)\\d{2}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}(\\d|X|x)$)";
        Pattern pattern =Pattern.compile(regex1);
        Matcher m = pattern.matcher(qq);//爬取数据
        while (m.find()){
            System.out.println(m.group());
        }
    }
    public static boolean checkQQ(String qq){
        return true;
    }

}
