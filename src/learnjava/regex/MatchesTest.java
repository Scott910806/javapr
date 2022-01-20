package src.learnjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesTest {
    public static void main(String[] args) {
        String[] mails = {
            "yxma2010@126.com",
            "scottma@gmail.com",
            "rockzhang@carzyit.org",
            "sarge@abcd.xx"
        };
        Pattern pattern = Pattern.compile("\\w{3,20}@\\w+\\.((com)|(org)|(cn)|(net)|(gov))");
        Matcher matcher = null;
        for(String mail : mails){
            if(matcher == null){
                matcher = pattern.matcher(mail);
            }else{
                matcher = matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? " 是" : " 不是") + "一个有效的邮件地址";
            System.out.println(result);
        }
    }
}
