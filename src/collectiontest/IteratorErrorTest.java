package src.collectiontest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合迭代过程中，不能改变集合元素，否则会抛异常 ConcurrentModificationException
 */
public class IteratorErrorTest {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("牧童骑黄牛");
        books.add("歌声振林樾");
        books.add("意欲捕鸣蝉");
        books.add("忽然闭口立");
        Iterator<String> it = books.iterator();
        while(it.hasNext()){
            // 注意Iterator 返回的对象是Object类型
            String book = it.next();
            System.out.println(book);
            if (book == "牧童骑黄牛"){
                // 改变集合元素，将抛异常
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
