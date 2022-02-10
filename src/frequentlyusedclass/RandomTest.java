package src.frequentlyusedclass;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Random类与ThreadLocalRandom类
 * ThreadLocalRandom类是Random类的增强版，且在并发访问的情况下替代Random，可以减少多线程资源竞争
 */

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        // Int类型表示范围内的随机数
        System.out.println(rand.nextInt());
        // 0到66只见那的随机整数
        System.out.println(rand.nextInt(66));
        // Long类型表示范围内的随机数
        System.out.println(rand.nextLong());
        // 0到1之间的随机float类型
        System.out.println(rand.nextFloat());
        // 0到1之间的随机double类型
        System.out.println(rand.nextDouble());
        byte[] buffer = new byte[16];
        // 随机生成元素类型为byte的数组
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));

        var randPro = ThreadLocalRandom.current();
        // 66到88之间的随机整数
        System.out.println(randPro.nextInt(66, 88));
        // 2.0到10.0之间的随机double类型
        System.out.println(randPro.nextDouble(2.0, 10.0));
    }
}
