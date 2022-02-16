package src.generictest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
// 下限通配符示例
public class MyUtils {
    public static <T> T copy(Collection<? super T> dest, Collection<T> src){
        T last = null;
        for(T s: src){
            dest.add(s);
        }
        return last;
    }
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(8);
        List<Number> ln = new ArrayList<>();
        MyUtils.copy(ln, li);
        System.out.println(li);
        System.out.println(ln);
    }  
}
