package src.collectiontest;

import java.util.Collection;
import java.util.HashSet;
/**
 * 通过iterator遍历集合
 */

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("牧童骑黄牛");
        books.add("歌声振林樾");
        books.add("意欲捕鸣蝉");
        books.add("忽然闭口立");
        var it = books.iterator();
        while(it.hasNext()){
            String book = it.next();
            System.out.println(book);
            if (book == "牧童骑黄牛"){
                // 删除next()返回的对象
                it.remove();
            }
            // 对book的赋值，不会影响books集合本身
            book = "test str";
        }
        System.out.println(books);
    }
}
