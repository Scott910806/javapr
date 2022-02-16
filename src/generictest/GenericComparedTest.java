package src.generictest;

import java.util.ArrayList;
import java.util.List;
/**
 * 当泛型形参传入不同的类型时，系统中并未生成所谓的泛型类，它们依然是被当做同一个类处理，所以静态变量、静态方法、静态初始化块的声明和初始化中，不允许使用泛型
 */
public class GenericComparedTest {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        // 以下将输出true
        System.out.println(l1.getClass() == l2.getClass());
        // 一下判断表达式编译会报错
        // if(l1 instanceof List<String>){
        //     System.out.println("系统并未生成泛型类，所以不能使用instanceof判断类型");
        // }
    }
}
