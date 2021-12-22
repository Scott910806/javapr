package learnjava.designmodel;

/**
 * 在外部类之外使用内部类，需要注意内部类的访问权限
 * private修饰: 外部类内部访问
 * 无修饰: 同一包中的类可访问
 * protected: 同一包中的类，及外部类的子类可访问 
 */
class Out{
    // 创建非静态内部类
    class In{
        public In(String msg){
            System.out.println(msg);
        }
    }
}

// 创建非静态内部类的子类
class SubClass extends Out.In{
    // 因为创建子类对象时，总是会调用父类构造器，故需要保证子类能够调用内部类的构造器，即需要创建一个外部类的实例调用内部类的构造器
    public SubClass(Out out){
        // super指向当前类的父类，即内部类
        out.super("hello world");
    }
}

public class CreatInnerInstance {
    public static void main(String[] args) {
        // 创建非静态内部类的对象
        Out.In in = new Out().new In("hello world");
        // 创建非静态内部类子类的对象
        SubClass sc = new SubClass(new Out());
    }
}
