package src.threadtest;

public class JoinThread extends Thread {
//    增加带参数的构造器
    public JoinThread(String name){
        super(name);
    }
//    重写run方法
    public void run(){
        for (var i=0; i<100; i++){
            System.out.println(getName() + " "+ i);
        }
    }

    public static void main(String[] args) throws Exception{
        new JoinThread("新线程").start();
        for (var i=0; i<100; i++){
            if (i==20){
                var jt = new JoinThread("被join的线程");
                jt.start();
//                主线程会等待被join线程执行完毕后再执行
                jt.join();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
