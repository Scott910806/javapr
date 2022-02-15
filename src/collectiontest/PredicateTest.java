package src.collectiontest;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
/**
 * 使用Predicate操作集合
 */
public class PredicateTest {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("轻量级java EE 企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂ios讲义");
        books.add("疯狂Android讲义");
        // 统计满足各条件的集合元素数量
        System.out.println(calAll(books, ele -> ele.contains("java")));
        System.out.println(calAll(books, ele -> ele.contains("疯狂")));
        System.out.println(calAll(books, ele -> ele.length() > 10));
    }
    // calAll 用于统计满足条件的对象数量，泛型方法
    public static<T> int calAll(Collection<T> books, Predicate<T> p){
        int total = 0;
        for (T book : books){
            if (p.test(book)){
                total ++ ;
            }
        }
        return total;
    }
}
