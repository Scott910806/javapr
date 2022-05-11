package src.threadtest;

public class DrawThreadPro extends Thread {
    private AccountPro accountPro;
    private double drawAmount;
    public DrawThreadPro(String name, AccountPro accountPro, double drawAmount){
        super(name);
        this.accountPro = accountPro;
        this.drawAmount = drawAmount;
    }
    public void run(){
        accountPro.draw(drawAmount);
    }
}
