package src.frequentlyusedclass;
/**
 * lenient模式:容错模式，输入超时制定属性范围的值，将发生进位
 * none-lenient模式:严格模式，输入超时制定属性范围的值，将抛异常
 */

import java.util.Calendar;

public class LenientTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 13);
        System.out.println(cal.getTime());
        // 设置为严格模式
        cal.setLenient(false);
        // set(int field, int value)具有惰性，不会立刻生效，只有再次调用获取时间时才会执行变更
        cal.set(Calendar.MONTH, 13);
        // 运行时将抛出异常
        System.out.println(cal.getTime());
    }
}
