package src.learnjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Pattern类与Matcher类的用法
 */
public class ReplaceTest {
    public static void main(String[] args) {
        String[] msgs = {
            "Java has regular expressions in 1.4",
            "regular expressions now expressing in Java",
            "Java repress oracular expressions"
        };
        // Pattern对象是正则表达式编译后在内存中的对象，一次编译，多次使用
        Pattern p = Pattern.compile("re\\w*");
        Matcher matcher = null;
        for(String msg : msgs){
            if (matcher == null) {
                // Matcher对象中保存字符串与正则表达式匹配的有关信息
                matcher = p.matcher(msg);
            }else{
                // 将现有的Matcher对象应用于新的字符串
                matcher.reset(msg);
            }
            // 将匹配到的字串替换为新的字符串
            System.out.println(matcher.replaceAll("哈哈"));
        }
    }
}
