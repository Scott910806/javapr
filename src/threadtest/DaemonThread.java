package src.threadtest;

/**
 * Daemon Thread在前台线程死亡后，也会死亡
 */
public class DaemonThread extends Thread {
    public void run(){
        for (var i=0; i<1000; i++){
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        var dt = new DaemonThread();
//        设置后台线程要在启动线程之前
        dt.setDaemon(true);
        dt.start();
        for (var i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
