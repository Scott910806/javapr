package src.collectiontest;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        var c = new ArrayList();
        c.add("scott");
        // 这里会自动装箱，集合不支持基本类型
        c.add(6);
        System.out.println("集合c中元素个数为: " + c.size());
        // 注意此处应为Integer对象，否则remove方法会将int类型的数字当做索引
        c.remove(Integer.valueOf(6));
        System.out.println("集合c中元素个数为: " + c.size());
        System.out.println("集合c是否包含scott: " + c.contains("scott"));
        c.add("rock");
        c.add("疯狂java讲义");
        System.out.println("集合c中的元素有: " + c);

        var books = new HashSet();
        books.add("java面向对象程序设计");
        books.add("疯狂java讲义");
        System.out.println("集合book是否包含集合c: " + books.containsAll(c));
        c.removeAll(books);
        System.out.println("c集合中的元素: " + c);
        // 清空集合
        c.clear();
        System.out.println("c集合中的元素: " + c);
        // 集合book与c的交集
        books.retainAll(c);
        System.out.println("book集合中的元素: " + books);
    }
}
