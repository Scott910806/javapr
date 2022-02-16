package src.generictest;

class Demo<T>{
    private T info;
    public Demo(T info){
        this.info = info;
    }
    public T getInfo(){
        return info;
    }
    public void setInfo(T info){
        this.info = info;
    }
}
public class WildcardsExtendsTest {
    public static void main(String[] args) {
        Demo<Integer> demo = new Demo<>(6);
        Demo<? extends Number> nDemo = demo;
        // 协变泛型能调用泛型类型作为返回值的方法
        Number n = nDemo.getInfo();
        System.out.println(n);
        // 以下代码将编译异常，setInfo(? extends Number)，不能确定参数是Number的哪个子类，所以协变的泛型，不能调用泛型类型作为形参的方法
        // nDemo.setInfo(3); 
    }
}
