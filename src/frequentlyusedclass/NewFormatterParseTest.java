package src.frequentlyusedclass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewFormatterParseTest {
    public static void main(String[] args) {
        // 定义任意格式的日期、时间字符串
        var str1 = "2022==02==14 10时 06分 09秒";
        // 根据日期时间格式字符串，定义解析模板
        var formatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时 mm分 ss秒");
        // 执行解析
        var dt1 = LocalDateTime.parse(str1, formatter1);
        System.out.println(dt1);

        var str2 = "2022$$$4月$$$13 20小时";
        var formatter2 = DateTimeFormatter.ofPattern("yyyy$$$M月$$$dd HH小时");
        var dt2 = LocalDateTime.parse(str2, formatter2);
        System.out.println(dt2);
    }
}
