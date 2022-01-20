package src.learnjava.regex;

import java.util.Arrays;

/**
 * String类提供的正则表达式用法
 */

public class StringRegex {
    public static void main(String[] args) {
        String[] msgs = {
            "Java has regular expressions in 1.4",
            "regular expressions now expressing in Java",
            "Java repress oracular expressions"
        };
        for(String msg : msgs){
            System.out.println(msg.replaceFirst("re\\w*", "哈哈"));
            System.out.println(Arrays.toString(msg.split("\\s")));
        }
    }
}
