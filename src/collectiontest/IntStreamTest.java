package src.collectiontest;

import java.util.stream.IntStream;
/**
 * 使用Stream操作集合
 * 步骤：通过builder()方法创建Steam对应的builer
 * 步骤：通过add()方法向builder中添加元素
 * 步骤：通过builer的build()方法，创建对应的Stream
 * 步骤：调用Stream的方法
 * Stream的方法可以分为 中间方法 和 末端方法
 * 中间方法：中间方法执行完不会关闭流
 * 末端方法：末端方法执行完成会关闭流，不能进行后续操作
 */
public class IntStreamTest {
    public static void main(String[] args) {
        var is = IntStream.builder()
        .add(20)
        .add(13)
        .add(-2)
        .add(18)
        .build();
        // 以下聚集方法(末端方法)中只能执行一行
        // System.out.println("is中所有元素的最大值: " + is.max().getAsInt());
        // System.out.println("is中所有元素的最小值: " + is.min().getAsInt());
        // System.out.println("is中所有元素的和: " + is.sum());
        // System.out.println("is中所有元素的平均值: " + is.average().getAsDouble());
        // System.out.println(is.allMatch(ele -> ele * ele >20));
        // System.out.println(is.anyMatch(ele -> ele * ele >20));        
        // 映射生成一个新的Steam

        IntStream newIs = is.map(ele -> ele*2 + 1);
        // System.out.println(newIs.count());
        // 简写的lambada表达式
        newIs.forEach(System.out::println);
    }
}
