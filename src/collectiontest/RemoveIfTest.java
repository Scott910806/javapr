package src.collectiontest;

import java.util.Collection;
import java.util.HashSet;

public class RemoveIfTest {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("轻量级java EE 企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂ios讲义");
        books.add("疯狂Android讲义");
        // 集合使用泛型时，可以记住其中的元素类型，不在需要进行类型转换
        books.removeIf(ele -> ele.length() >14);
        // books.removeIf(ele -> ((String) ele).length() > 14);
        System.out.println(books);
        books.removeIf(ele -> ele.contains("ios"));
        System.out.println(books);
    }    
}
