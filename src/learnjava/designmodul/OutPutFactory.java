package learnjava.designmodul;
import learnjava.Printer;
import learnjava.OutPut;
/**
 * 面向接口编程:简单工厂模式
 */

public class OutPutFactory {
    public OutPut getOutFactory(){
        // return new Printer();
        return new BetterPrinter();
    }
    public static void main(String[] args) {
        OutPutFactory of = new OutPutFactory();
        Computer c = new Computer(of.getOutFactory());
        c.keyIn("赵客缦胡缨");
        c.keyIn("吴钩霜月明");
        c.print();
    }
}
