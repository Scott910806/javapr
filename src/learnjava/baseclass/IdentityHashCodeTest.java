package learnjava.baseclass;

public class IdentityHashCodeTest {
    public static void main(String[] args) {
        var s1 = new String("hello");
        var s2 = new String("hello");
        // String类重写了hashCode方法，根据字符串的值计算hash值
        System.out.println(s1.hashCode() + "----" + s2.hashCode());
        // identityHashCode()方法根据对象的地址计算hash值
        System.out.println(System.identityHashCode(s1) + "----" + System.identityHashCode(s2));
        var s3 = "hello";
        var s4 = "hello";
        // s3、s4是字符串常量，在内存中地址相同
        System.out.println(System.identityHashCode(s3) + "----" + System.identityHashCode(s4));
    }
}
