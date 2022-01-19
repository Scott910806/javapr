package src.learnjava;

/**
 * 理解类成员
 */
public class NullAccessStatic {
    public static void test(){
        System.out.println("这是一个类方法");
    }
    public static void main(String[] args) {
        NullAccessStatic nas = null;
        // 类的实例调用类方法，底层逻辑是通过类本身调用类方法
        nas.test();
        // NullAccessStatic.test();
    }
}
