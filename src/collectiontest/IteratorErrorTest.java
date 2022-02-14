package src.collectiontest;

import java.util.HashSet;

/**
 * 集合迭代过程中，不能改变集合元素，否则会抛异常 ConcurrentModificationException
 */
public class IteratorErrorTest {
    public static void main(String[] args) {
        var books = new HashSet();
        books.add("牧童骑黄牛");
        books.add("歌声振林樾");
        books.add("意欲捕鸣蝉");
        books.add("忽然闭口立");
        var it = books.iterator();
        while(it.hasNext()){
            var book = (String) it.next();
            System.out.println(book);
            if (book == "牧童骑黄牛"){
                // 改变集合元素，将抛异常
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
