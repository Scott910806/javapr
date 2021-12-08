package src.learnjava.designModel;
/**
 * 面向接口编程：命令模式
 * 示例中，将Command接口类型的对象，作为ProcessArray类中的process方法的入参
 */
public class ProcessArray {
    public void process(int[] target, Command cmd){
        for(var t : target){
            cmd.process(t);
        }
    }    
}
