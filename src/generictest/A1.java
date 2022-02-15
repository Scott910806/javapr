package src.generictest;

// 定义接口、类时使用泛型，使用时则必须传入特定的类型或者不传，不能再使用泛型，以下错误示范
// public class A1 extends Apple<T> 
// 不传入特定类型时，则使用原始类型(raw type)，即为Object类型
public class A1 extends Apple<String> {
    // 重写父类方法时，返回类型已为String
    public String getInfo(){
        return "subClass" + super.getinfo();
    }
}
