package src.generictest;

interface Foo<T>{
    void test(T t);
}
public class AnnoymousTest {
    
    Foo<String> f = new Foo<>() {
        public void test(String t){
            System.out.println("test方法的参数为：" + t);
        }
    };
    // 此泛型通配符的上限相当于Object
    Foo<?> fo = new Foo<>() {
        public void test(Object t){
            System.out.println("test方法的Object参数为：" + t);
        }
    };
    // 通配符上限为Number
    Foo<? extends Number> fn = new Foo<>() {
        public void test(Number t){
            System.out.println("test方法的Number参数为：" + t);
        }
    }; 
}
