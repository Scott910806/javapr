package src.generictest;

import java.util.ArrayList;
import java.util.List;

/**
 * 逆变泛型的集合可以添加元素，但是有限制
 */
class A{}
class B extends A{}
class C extends B{}

public class WildcardsSuperTest {
    public static void main(String[] args) {
        List<? super B> l = new ArrayList<B>();
        // l.add(new A()); 编译报错
        l.add(new B());
        l.add(new C());
    }    
}
