package src.frequentlyusedclass;

/**
 * Math类构造器使用private修饰，所以无法创建对象
 * 类所有的方法都是类方法
 */
public class MathTest {
    public static void main(String[] args) {
        // 乘方
        System.out.println(Math.pow(2, 3));
        // 求绝对值
        System.out.println(Math.abs(-4.5));
        // e
        System.out.println(Math.E);
        // π
        System.out.println(Math.PI);
        // 最大值
        System.out.println(Math.max(3, 9));
        // 最小值
        System.out.println(Math.min(6.6, 8.8));
        // 0到1之间的随机数
        System.out.println(Math.random());
        // 向下取整
        System.out.println(Math.floor(7.66));
        // 向上取整
        System.out.println(Math.ceil(8.12));
    }
}
