package src.learnjava.baseclass;

import java.util.Objects;
/**
 * Objects工具类，大部分方法是空指针安全的
 */
public class ObjectsTest {
    // 默认值为null
    static ObjectsTest obj;
    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        // 如果obj为null，会抛异常NPE
        System.out.println(Objects.requireNonNull(obj));
    }
}
