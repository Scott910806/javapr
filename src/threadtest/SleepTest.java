package src.threadtest;

public class SleepTest {
    public static void main(String[] args) throws Exception{
        for (var i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.sleep(1000);
        }
    }
}
