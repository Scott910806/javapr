package learnjava.designModel;

/**
 * 匿名内部类
 * 匿名内部类不能是抽象类，因为系统创建匿名内部类时，会立即创建该类的对象，而抽象类不能创建对象
 * 匿名内部类不能定义构造器，因为没有名字
 */

interface ProductPro{
    double getPrice();
    String getName();
}

public class AnonymousTest {
    public void test(ProductPro p){
        System.out.println("产品名字: "+ p.getName() + ", 价格: " + p.getPrice());
    }
    public static void main(String[] args) {
        var at = new AnonymousTest();
        // 通过接口创建匿名内部类的对象
        at.test(new ProductPro() {
            public double getPrice(){
                return 2.34;
            }
            public String getName(){
                return "数据线";
            }
        });
    }
}
