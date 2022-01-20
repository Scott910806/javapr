package src.learnjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
    public static void main(String[] args) {
        var str = "我想求购一本《java讲义》，请联系我13600010002"
                + "交个朋友，联系方式15800020003"
                + "回收旧手机，电话13900030004";
        Pattern pattern = Pattern.compile("((13\\d)|(15\\d))\\d{8}");
        Matcher matcher = pattern.matcher(str);
        // 字符串中是否有字串与正则表达式匹配
        while(matcher.find()){
            // 返回匹配到的字串
            System.out.println(matcher.group());
        }
    }
}
