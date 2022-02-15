package src.collectiontest;

import java.util.Collection;
import java.util.HashSet;

/**
 * 通过forEach(Consumer action)方法遍历集合, Consumer 是一个函数式接口
 * Iterable接中的forEach方法，Collection是Iterable的子接口，所以可以使用该方法
 */
public class CollectionEach {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("牧童骑黄牛");
        books.add("歌声振林樾");
        books.add("意欲捕鸣蝉");
        books.add("忽然闭口立");
        books.forEach(obj -> System.out.println("集合中的元素: " + obj));
    }
}
