package src.frequentlyusedclass;

import java.math.BigDecimal;

/**
 * BigDecimal类提供了精度运算
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        // 创建精确的浮点数
        var f1 = new BigDecimal("0.05");
        // 创建精确浮点数
        var f2 = BigDecimal.valueOf(0.01);
        // 下面方法创建的浮点数依然是不准确的
        var f3 = new BigDecimal(0.05);
        // 以下运算结果是精确的
        System.out.println(f1.add(f2));
        System.out.println(f1.subtract(f2));
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divide(f2));

        // 以下运算是不精确的
        System.out.println(f3.add(f2));
        System.out.println(f3.subtract(f2));
        System.out.println(f3.multiply(f2));
        System.out.println(f3.divide(f2));
    }
}
