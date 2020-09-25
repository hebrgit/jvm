package jvm.demo02;


/**
 * 查询内从情况方式：
 *  一、命令行：1、jps找到程序pid
 *          2、jstat -gc pid
 *  二、XX:+PrintGCDetails
 */
public class HeadSpaceInitial {


    public static void main(String[] args)  {


        long maxMemory = Runtime.getRuntime().maxMemory();

        long initMemory = Runtime.getRuntime().totalMemory();


        //初始值
        System.out.println("Xms:"+initMemory/1024/1024);
        //最大值
        System.out.println("XmX:"+maxMemory/1024/1024);
    }
}
