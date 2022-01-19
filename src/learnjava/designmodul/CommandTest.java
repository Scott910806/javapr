package src.learnjava.designmodul;

// 实现数组元素输出
class PrintCommand implements Command{
    public void process(int element){
        System.out.println("迭代输出数组元素: "+ element);
    }
}
// 实现数组元素平方
class SquareCommand implements Command{
    public void process(int element){
        System.out.println("输出数组元素的平方: "+ element*element);
    }
}
public class CommandTest {
    public static void main(String[] args) {
        var pa = new ProcessArray();
        int[] target = {3,-4,5,-6};
        pa.process(target, new PrintCommand());
        pa.process(target, new SquareCommand());
    }
}
