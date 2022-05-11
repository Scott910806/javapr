package src.threadtest;

/**
 * 创建一个Account类，演示线程安全问题
 * accountNo 账户号
 * balance 账户余额
 */
public class Account {
    private String accountNo;
    private double balance;
    public Account(){};
    public Account(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    };
    public String getAccountNo(){
        return accountNo;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public void setBalance(double balance){
        this.balance = balance;
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
