package src.generictest;
/**
 * 在类的定义中使用泛型，在类内部可以将泛型参数当做类型使用
 */
public class Apple<T> {
    private T info;
    public Apple(){}
    public Apple(T info){
        this.info = info;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getinfo(){
        return this.info;
    }
    public static void main(String[] args) {
        Apple<String> a1 = new Apple<>("hello");
        System.out.println(a1.getinfo());

        Apple<Double> a2 = new Apple<Double>(3.14);
        System.out.println(a2.getinfo());
    }
}
