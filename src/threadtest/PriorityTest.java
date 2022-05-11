package src.threadtest;

/**
 * NORMAL_PRIORITY
 * MIN_PRIORITY
 * MAX_PRIORITY
 */
public class PriorityTest extends Thread{
    public PriorityTest(String name){
        super(name);
    }
    public void run(){
        for (var i=0; i<50; i++){
            System.out.println(getName()+"，其优先级为：" + getPriority() + "，循环变量的值为：" + i);
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        for (var i=0; i<100; i++){
            if (i==10){
                var low = new PriorityTest("低级线程");
                low.start();
                System.out.println("创建之初低级线程优先级为：" + low.getPriority());
                low.setPriority(Thread.MIN_PRIORITY);
            }
            if (i==20){
                var high = new PriorityTest("高级线程");
                high.start();
                System.out.println("创建之初高级线程优先级为：" + high.getPriority());
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
