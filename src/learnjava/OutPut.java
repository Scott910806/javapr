package src.learnjava;
/**
 * 接口
 */
public interface OutPut {
    // 接口中定义常量
    int MAX_CACHE_LINE = 50;
    // 接口中定义抽象方法
    void out();
    void getData(String msg);
    // 接口中定义默认方法
    default void print(String... msgs){
        for(String msg : msgs){
            System.out.println(msg);
        }
    }
    // 接口中定义默认方法
    default void test(){
        System.out.println("test()默认方法");
    }
    // 接口中定义类方法
    static String staticTest(){
        return "接口里的类方法";
    }
    // 接口中定义私有方法
    private void foo(){
        System.out.println("foo()私有方法");
    }
    // 接口中定义私有类方法
    private static void bar(){
        System.out.println("bar()私有类方法");
    }
}
