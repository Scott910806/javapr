package src.frequentlyusedclass;

import java.util.Random;

/**
 * Random类的两个对象，当种子相同且方法调用顺序也相同时，就会产生相同的随机数字系列
 * 所以使用Random类时，推荐使用当前时间戳作为种子
 */
public class SeedTest {
    public static void main(String[] args) {
        var r1 = new Random(50);
        System.out.println(r1.nextBoolean());
        System.out.println(r1.nextInt());
        System.out.println(r1.nextDouble());

        var r2 = new Random(50);
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextInt());
        System.out.println(r2.nextDouble());
    }
}
