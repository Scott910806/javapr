package src.threadtest;

/**
 * 通过继承Thread类创建进程
 */
public class FirstThread extends Thread {
    private int i;
//    重写run方法
    public void run(){
        for (; i<100; i++){
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (var i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i==20){
//                创建第一个进程
                new FirstThread().start();
//                创建第二个进程
                new FirstThread().start();
            }
        }
    }
}
