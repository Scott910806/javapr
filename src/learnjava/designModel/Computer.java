package src.learnjava.designModel;
import src.learnjava.OutPut;
/**
 * 面向接口编程
 * 示例中Computer类，组合了一个OutPut类型的接口的对象，从而将Computer类与Printer类完全分离
 */
public class Computer {
    private OutPut out;
    public Computer(OutPut out){
        this.out = out;
    }
    // 模拟输入
    public void keyIn(String msg){
        out.getData(msg);
    }
    // 模拟输出
    public void print(){
        out.out();
    }
}
