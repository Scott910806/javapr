package src.generictest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DianmondTest {
    public static void main(String[] args) {
        // java自动推断ArrayList的<>中应该是String
        List<String> books= new ArrayList<>();
        books.add("疯狂java讲义");
        books.add("疯狂Android讲义");
        books.forEach(ele -> System.out.println(ele.length()));
        // java自动推断HashMap的<>中应该是String、List<String>
        Map<String, List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("西天取经路");
        schoolsInfo.put("孙悟空", schools);
        schoolsInfo.forEach((k, v) -> System.out.println(k + "----->" + v));
    }
}
