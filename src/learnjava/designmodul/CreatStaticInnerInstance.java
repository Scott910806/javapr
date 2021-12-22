package learnjava.designmodul;

/**
 * 在外部类之外使用静态内部类
 */
class StaticOut{
    static class StaticIn{
        public StaticIn(){
            System.out.println("静态内部类的构造器");
        }
    }
}

// 创建静态内部类的子类
class SubStaticIn extends StaticOut.StaticIn{
    public SubStaticIn(){
        super();
    }
}

public class CreatStaticInnerInstance {
    public static void main(String[] args) {
        // 创建静态内部类的对象
        StaticOut.StaticIn si = new StaticOut.StaticIn();
        // 创建静态内部类子类的对象
        SubStaticIn ssi = new SubStaticIn();
    }
}
