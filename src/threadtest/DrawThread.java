package src.threadtest;

/**
 * 使用同步监视器
 */
public class DrawThread extends Thread{
    private Account account;
    private double drawAmount;
    public DrawThread(String name, Account account, double drawAmount){
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    public void run() {
//        account作为同步监视器：线程对account操作前，会对account进行锁定，释放锁之前其他线程不能对account进行操作
        synchronized (account) {
            if (account.getBalance() >= drawAmount) {
                System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);
//            这里设置线程休眠，是为了让线程并发问题更容易显现
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("\t余额为：" + account.getBalance());
            } else {
                System.out.println(getName() + "取钱失败！余额不足");
            }
        }
    }
}
