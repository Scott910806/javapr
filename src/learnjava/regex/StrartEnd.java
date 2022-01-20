package src.learnjava.regex;

import java.util.regex.*;

public class StrartEnd {
    public static void main(String[] args) {
        var str = "Java is easy";
        Matcher matcher = Pattern.compile("\\w+").matcher(str);
        // 判断字符串前面部分是否匹配正则表达式
        System.out.println(matcher.lookingAt());
        while(matcher.find()){
            System.out.println(matcher.group() + "字串的起始位置是：" + matcher.start() + ", 其结束位置是：" + matcher.end());
        }
    }
}
