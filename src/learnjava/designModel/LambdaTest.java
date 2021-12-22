package learnjava.designmodel;
import javax.swing.JFrame;

/**
 * lambda:lambda是对某些情况下匿名内部类的使用的简化，lambda的目标是函数式接口(只有一个抽象方法的接口)，可以使用注解(@FunctionalInterface)限定对函数式接口的检查
 */

@FunctionalInterface
interface Convert{
    Integer convert(String form);
}

@FunctionalInterface
interface Mytest{
    String test(String a, int b, int c);
}

@FunctionalInterface
interface YourTest{
    // JFrame 是java自有的类
    JFrame win(String title);
}

public class LambdaTest {
    public static void main(String[] args) {
        // 匿名内部类方式
        // Convert convert1 = new Convert() {
        //     public Integer convert(String form){
        //         return Integer.valueOf(form);
        //     }
        // };
        
        // lambda方式
        // Convert convert1 = (form) -> {return Integer.valueOf(form);};

        // lambda简化: 引用类方法
        // Convert convert1 = form -> Integer.valueOf(form);
        Convert convert1 = Integer::valueOf;
        System.out.println(convert1.convert("99"));

        // lambda简化: 引用特定对象的方法
        // Convert convert2 = form -> "fkit.org".indexOf(form);
        Convert convert2 = "fkit.org"::indexOf;
        System.out.println(convert2.convert("it"));
        
        // 引用某类对象的实例方法
        // Mytest mt = (a, b, c) -> a.substring(b, c);
        Mytest mt = String::substring;
        System.out.println(mt.test("hello world", 2, 6));
        
        // 引用构造器
        // YourTest yt = title -> new JFrame(title);
        YourTest yt = JFrame::new;
        System.out.println(yt.win("welcome"));
    }
}
