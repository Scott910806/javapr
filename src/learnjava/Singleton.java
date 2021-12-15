package learnjava;
/**
 * 单例类：只能创建一个对象的类
 * 1、使用private关键字隐藏类的构造器
 * 2、提供static方法返回类的对象
 * 3、通过类变量缓存类创建的对象，以判断是否已存在对象
 */
public class Singleton {
    // 定义类变量保存类创建的对象
    private static Singleton instance;
    private Singleton(){}
    // 返回类创建的对象
    public static Singleton getInstance(){
        // 如果instance为null，则表明没有已创建的变量
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // s1、s2 指向同一个对象
        System.out.println(s1 == s2);
    }
}
