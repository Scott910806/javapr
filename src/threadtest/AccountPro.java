package src.threadtest;

/**
 * 同步方法
 */

public class AccountPro {
    private String accountNo;
    private double balance;
    public AccountPro(){};
    public AccountPro(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    };
    public String getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public double getBalance(){
        return balance;
    }
//    提供一个线程安全的draw方法，完成取钱操作
    public synchronized void draw(double drawAmount){
        if (balance >= drawAmount){
            System.out.println(Thread.currentThread().getName() + "取钱成功！突出钞票：" + drawAmount);
            try {
                Thread.sleep(1);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            balance -= drawAmount;
        }else {
            System.out.println(Thread.currentThread().getName() + "余额不足！取款失败");
        }
    }
    //    重写hashCode方法
    public int hashCode(){
        return accountNo.hashCode();
    }
    //    重写equals方法
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj != null && obj.getClass() == Account.class){
            var target = (Account)obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }
}
