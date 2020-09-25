package jvm.demo03;

/**
 * @author Administrator
 * @Class StackAllocation
 * @DATA  2020/9/24:21:24
 * @decs -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class StackAllocation {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++){
            alloc();
        }
        long end = System.currentTimeMillis();

        System.out.println("耗时："+(end-start)+"毫秒");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void alloc() {
        User user = new User();
    }
}
