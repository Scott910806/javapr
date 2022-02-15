package src.collectiontest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Java8 Iterator新增了 forEachRemaining(Consumer action)方法，可以遍历Iterator对象
 */
public class IteratorEach {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("牧童骑黄牛");
        books.add("歌声振林樾");
        books.add("意欲捕鸣蝉");
        books.add("忽然闭口立");
        Iterator<String> it = books.iterator();
        it.forEachRemaining(obj -> System.out.println(obj));
    }
}
