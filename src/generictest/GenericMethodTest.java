package src.generictest;

import java.util.ArrayList;
import java.util.Collection;

// 泛型方法示例
public class GenericMethodTest {
    public static <T> void fromArrayToCollection(T[] a, Collection<T> c){
        for(T t : a){
            c.add(t);
        }
    }
    public static void main(String[] args) {
        Object[] oa = new Object[20];
        Collection<Object> co = new ArrayList<>();
        // 只比较泛型参数
        // 推断T为Object类型
        fromArrayToCollection(oa, co);
        String[] sa = new String[50];
        Collection<String> cs = new ArrayList<>();
        // 推断T为String类型
        fromArrayToCollection(sa, cs);
        // 推断T为Object类型
        fromArrayToCollection(sa, co);

        Integer[] ia = new Integer[20];
        Float[] fa = new Float[30];
        Number[] na = new Number[40];
        Collection<Number> cn = new ArrayList<>();
        // 推断T为Number类型
        fromArrayToCollection(ia, cn);
        // 推断T为Number类型
        fromArrayToCollection(fa, cn);
        // 推断T为Number类型
        fromArrayToCollection(na, cn);
        // 以下将编译错误，因为Number不是String的子类
        // fromArrayToCollection(na, cs);
    }
}
