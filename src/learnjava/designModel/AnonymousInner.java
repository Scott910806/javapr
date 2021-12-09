package src.learnjava.designModel;

/**
 * 匿名内部类
 */
abstract class Device{
    private String name;
    public abstract double getPrice();
    public Device(){}
    public Device(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class AnonymousInner {
    public void test(Device device){
        System.out.println("设备名: " + device.getName() + ", 价格: " + device.getPrice());
    }
    public static void main(String[] args) {
        var ai = new AnonymousInner();
        // 通过抽象类创建匿名内部类的对象
        ai.test(new Device("鼠标") {
            // 实现父类的方法
            public double getPrice(){
                return 88.8;
            }
        });
        // 调用无参构造器，创建匿名内部类的对象
        var d = new Device(){
            // 初始化块
            {System.out.println("匿名内部类初始化块");}
            // 实现父类的方法
            public double getPrice(){
                return 99.9;
            }
            // 重写父类的方法
            public String getName(){
                return "键盘";
            }
        };
        ai.test(d);
    }
}
