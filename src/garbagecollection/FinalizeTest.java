package src.garbagecollection;
/**
 * 1.系统进行垃圾回收对程序透明，具有不确定性
 * 2.手动执行runFinalization方法，不影响系统回收时，执行runFinalization方法
 */

public class FinalizeTest {
    private static FinalizeTest ft = null;
    public void info(){
        System.out.println("测试资源清理方法finalize");
    }

    public static void main(String[] args) {
        new FinalizeTest();
        // 通知系统进行垃圾回收
        System.gc();
        // 手动调用，强制垃圾回收机制调用可恢复对象的finalize方法
        // 下面两种方式，效果相同
        System.runFinalization();
        // Runtime.getRuntime().runFinalization();
        ft.info();
    }
    // 重写finalize方法，使ft复活
    public void finalize(){
        ft = this;
    }
}
