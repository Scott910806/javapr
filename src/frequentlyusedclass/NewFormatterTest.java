package src.frequentlyusedclass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewFormatterTest {
    public static void main(String[] args) {
        // 创建日期格式化模板的数组
        var formatters = new DateTimeFormatter[] {
            DateTimeFormatter.ISO_LOCAL_DATE,
            DateTimeFormatter.ISO_LOCAL_TIME,
            DateTimeFormatter.ISO_LOCAL_DATE_TIME,
            DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
            // 自定义时间格式模板
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        };
        var date = LocalDateTime.now();
        for (DateTimeFormatter formatter : formatters){
            // 下面两种方式格式化日期效果相同
            // System.out.println(date.format(formatter));
            System.out.println(formatter.format(date));
        }
    }
}
