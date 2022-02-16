package src.generictest;

class Foo{
    public <T> Foo(T t){
        System.out.println(t);
    }
}

class MyClass<E>{
    public <T> MyClass(T t){
        System.out.println(t);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        // 根据入参推断T为String类型
        new Foo("hello");
        // 根据入参推断T为Integer类型
        new Foo(2345);
        // 显示指定T为String类型
        new <String> Foo("hello");
        // 以下代码将编译报错
        // new <String> Foo(3.14);

        MyClass<String> m1 = new MyClass<>(5);
        MyClass<String> m2 = new MyClass<String>(6);
        MyClass<String> m3 = new <Integer> MyClass<String>(7);
        // 如果显示地制定了构造器的泛型参数，则不能使用菱形语法，以下是错误示范
        // MyClass<String> m4 = new <Integer> MyClass<>(8);
    }
}
