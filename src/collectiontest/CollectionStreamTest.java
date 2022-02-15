package src.collectiontest;

import java.util.HashSet;

public class CollectionStreamTest {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<>();
        books.add("轻量级java EE 企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂ios讲义");
        books.add("疯狂Android讲义");
        // 使用流统计元素
        System.out.println(books.stream().filter(ele -> ele.contains("疯狂")).count());
        System.out.println(books.stream().filter(ele -> ele.length() > 10).count());
    }
}
