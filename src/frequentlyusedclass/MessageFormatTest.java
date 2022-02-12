package src.frequentlyusedclass;

import java.text.MessageFormat;

public class MessageFormatTest {
    public static void main(String[] args) {
        // 处理包含占位符的字符串
        var msg = "hello {0}, welcome to {1}!";
        System.out.println(MessageFormat.format(msg, "scott", "China"));
        System.out.printf("hello %1$s, welcome to %2$s!", "rock", "Beijing");
    }
}
