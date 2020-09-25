package jvm.demo03;

/**
 * @author Administrator
 * @class ScalarRepalce
 * @date 2020/9/24:21:49
 * @decs 标量替换测试
 *
 *  -Xms100m -Xmx100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 */
public class ScalarRepalce {


    public static  void  alloc(){
        User u = new User();
        u.string = "11";
        u.i = 1;
    }

    public static void main(String[] args){

        long start = System.currentTimeMillis();
        for (int i= 0; i < 10000000; i++){
            alloc();
        }
        long end = System.currentTimeMillis();

        System.out.println("耗时："+(end-start)+"毫秒");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
