package example4;

import java.util.StringJoiner;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class StringBuilderDome4 {
    public static void main(String[] args) {//间隔符，开头，结尾
        StringJoiner sj =new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
        StringJoiner sj1 =new StringJoiner(",","=",".");
        sj1.add("aaa").add("bbb").add("ccc");
        System.out.println(sj1);
    }
    }

