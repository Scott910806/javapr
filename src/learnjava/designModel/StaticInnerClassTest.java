package learnjava.designmodel;
/**
 * 内部类:静态内部类
 */
public class StaticInnerClassTest {
    private int prop1 = 5;
    private static int prop2 = 10;
    static class StaticInnerClass{
        private static int age = 18;
        public void accessOuterProps(){
            // 静态内部类的成员不能访问外部类的非静态成员
            // System.out.println(prop1);
            // 静态内部类的成员可以访问所寄生的外部类的非静态成员
            System.out.println(prop2);
        }
    }
    public void accessInnerProps(){
        // 外部类访问静态内部类的成员
        System.out.println(StaticInnerClass.age);
    }
    public static void main(String[] args) {
        new StaticInnerClassTest().accessInnerProps();
    }
}
