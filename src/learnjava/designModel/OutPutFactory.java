package src.learnjava.designModel;
import src.learnjava.Printer;
import src.learnjava.OutPut;
/**
 * 面向接口编程:简单工厂模式
 */

public class OutPutFactory {
    public OutPut getOutFactory(){
        return new Printer();
    }
    public static void main(String[] args) {
        OutPutFactory of = new OutPutFactory();
        Computer c = new Computer(of.getOutFactory());
        c.keyIn("赵客缦胡缨");
        c.keyIn("吴钩霜月明");
        c.print();
    }
}
