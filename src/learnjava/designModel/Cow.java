package learnjava.designModel;
/**
 * 内部类：非静态内部类、静态内部类
 * 内部类的上一层级是某个外部类，所以可以使用private、static、protected修饰
 * 内部类可以直接访问所寄生的外部类的成员，但静态内部类的成员不能访问外部类的非静态成员(遵循java中静态成员中不能访问实例成员的原则)
 * 外部类可以通过内部类的实例访问内部类的实例成员，通过内部类本身访问内部类的类成员
 * 外部类的静态成员，不能访问非静态的内部类
 * 非静态内部类，不能包含任何静态成员
 */
public class Cow {
    private double weight;
    public Cow(){}
    public Cow(double weight){
        this.weight = weight;
    }
    // 定义非静态内部类
    private class CowLeg{
        private double length;
        private String color;
        public CowLeg(){}
        public CowLeg(double length, String color){
            this.length = length;
            this.color = color;
        }
        // 非静态内部类的实例方法
        public void info(){
            System.out.println("当前牛腿颜色是：" + color + ",长：" + length);
            // 内部类直接访问外部类的私有变量
            System.out.println("该牛腿所在牛的重量是：" + weight);
        }
    }
    public void test(){
        var cl = new CowLeg(1.2, "黑白相间");
        cl.info();
    }
    public static void main(String[] args) {
        var cow = new Cow(251.2);
        cow.test();
    }
}
