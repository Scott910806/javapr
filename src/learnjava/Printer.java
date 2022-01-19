package src.learnjava;

interface Product{
    int getProduceTime();
}
// 实现接口，可直接获取接口的常量、抽象方法、默认方法
// Printer类实现了OutPut、Product接口
public class Printer implements OutPut, Product {
    private String[] printData = new String[MAX_CACHE_LINE];
    // 记录需要打印的作业数量
    private int dataNum = 0;
    public void out(){
        // 只要还有作业，就继续打印
        while(dataNum > 0){
            System.out.println("打印机打印: " + printData[0]);
            // 把作业队列整体前移1位，并将作业数量减1
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }
    public void getData(String msg){
        if(dataNum >= MAX_CACHE_LINE){
            System.out.println("输出队列已满，添加失败");
        }else{
            // 将打印数据添加到队列，并且将作业数量加1
            printData[dataNum++] = msg;
        }
    }
    public int getProduceTime(){
        return 45;
    }
    public static void main(String[] args) {
        OutPut o = new Printer();
        o.getData("牧童骑黄牛");
        o.getData("歌声振林樾");
        o.out();
        o.getData("意欲捕鸣蝉");
        o.getData("忽然闭口立");
        o.out();
        o.print("侠客行", "唐", "李白");
        o.test();
        Product p = new Printer();
        p.getProduceTime();
        Object obj = p;
    }
}
