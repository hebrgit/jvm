package jvm.demo02;


/**
 * 设置新生代和老年代
 *
 * -XX:NewRatio=3 设置新生代老年代内存比例
 * -Xmn：设置新生代内从
 *
 * -XX:SurvivorRatio: 设置新生代Eden区比例
 *
 * -XX:-UseAdaptiveSizePolicy 关闭自适应内存分配策略
 */
public class EdenSurvivorTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("==============");

        Thread.sleep(1000000);
    }
}
