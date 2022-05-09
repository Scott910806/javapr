package src.threadtest;
/**
 * 通过Callable和Future创建进程
 */

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] args){
//        通过lambda方式创建Callable对象，并使用FutureTask类来包装该对象（FutureTask类代表Callable对象的返回值）
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)() -> {
            var i = 0;
            for (; i<100; i++){
                System.out.println(Thread.currentThread().getName() + " 循环变量i的值: " + i);
            }
//            call方法可以有返回值
            return i;
        });
        for (var i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + " 循环变量i的值: " +i);
            if (i==20){
                new Thread(task, "有返回值的线程").start();
            }
        }
        try {
            System.out.println("线程返回值为：" + task.get());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
