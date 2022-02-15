package src.collectiontest;

import java.util.Collection;
import java.util.HashSet;
/**
 * 通过foreach循环遍历集合
 */
public class ForEachTest {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("牧童骑黄牛");
        books.add("歌声振林樾");
        books.add("意欲捕鸣蝉");
        books.add("忽然闭口立");
        for(String book : books){
            System.out.println(book);
            if(book.equals("牧童骑黄牛")){
                // 修改集合将抛异常
                // books.remove(book);
            }
        }
        System.out.println(books);
    }
}
