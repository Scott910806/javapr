package src.threadtest;

public class DrawTestPro {
    public static void main(String[] args) {
        AccountPro accp = new AccountPro("1234567",1000);
        new DrawThreadPro("甲", accp, 800).start();
        new DrawThreadPro("乙", accp, 800).start();
    }
}
