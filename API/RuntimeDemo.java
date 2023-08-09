package API;

import java.io.IOException;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime r1 =Runtime.getRuntime();
        //cpu线程数
        System.out.println(r1.availableProcessors());
        //总内存大小,byte
        System.out.println(r1.maxMemory()/1024/1024);
        //已经获取总内存大小,byte
        System.out.println(r1.totalMemory()/1024/1024);
        //剩余内存
        System.out.println(r1.freeMemory()/1024/1024);
        //运行cmd命令，很多cmd命令可以使用
        Runtime.getRuntime().exec("notepad");
    }




}
