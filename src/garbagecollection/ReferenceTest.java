package src.garbagecollection;

import java.lang.ref.WeakReference;

//  弱引用示例：系统进行垃圾回收时，不管内存是否足够，弱引用所引用的对象都会被回收
public class ReferenceTest {
    public static void main(String[] args) throws Exception{
        // 创建字符串对象
        var str = new String("hello world");
        // 创建弱引用对象
        var wt = new WeakReference(str);
        // 切断str引用关系
        str = null;
        // 取出弱引用所引用的对象
        System.out.println(wt.get());
       
        // 垃圾回收
        System.gc();
        System.runFinalization();
        // 再次取出弱引用所引用的对象
        System.out.println(wt.get());
    }
}
