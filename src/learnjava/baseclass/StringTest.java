package src.learnjava.baseclass;

public class StringTest {
    public static void main(String[] args) {
        var s = "fkit.org";
        // 获取字符串指定索引位置上的字符
        System.out.println("s.charAt(5): " + s.charAt(5));

        var s1 = "abcdefghijklmn";
        var s2 = "abcdefghij";
        var s3 = "abcdefghijalml";
        // 字符串比较
        System.out.println(s1.compareTo(s2)); // 返回s1、s2的长度差
        System.out.println(s1.compareTo(s3)); // 返回第一个不同的字符的差值，即 k-a
        // 字符串连结
        System.out.println(s1.concat(s));
        System.out.println(s1 + s);
    
        var sb = new StringBuffer(s1);
        System.out.println(s1.contentEquals(sb));

        char[] s4 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        System.out.println(String.copyValueOf(s4));
        System.out.println(String.copyValueOf(s4, 6, 5));
        var s5 = new String(s4);
        var s6 = new String(s4, 6, 5);
        System.out.println(s5);
        System.out.println(s6);

        System.out.println(s5.endsWith("world"));
        System.out.println(s6.endsWith("hello"));

        var s7 = "Scott";
        var s8 = "scoTT";
        var s9 = "Scott";
        System.out.println(s7.equals(s8));
        System.out.println(s7.equals(s9));
        System.out.print(s7.equalsIgnoreCase(s8));

        System.out.println(s7.getBytes());

        var s10 = "ejb";
        s10.getChars(0, 2, s4, 6);
        System.out.println(s4);
    }
}
