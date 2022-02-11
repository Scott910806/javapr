package src.frequentlyusedclass;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        var c = Calendar.getInstance();
        // 获取当前时间
        System.out.println(c.getTime());
        // 获取当前时区
        System.out.println(c.getTimeZone());;
        // 获取当前年份
        System.out.println(c.get(Calendar.YEAR));
        // 获取当前月份（0到11）
        System.out.println(c.get(Calendar.MONTH));
        // 获取当前天
        System.out.println(c.get(Calendar.DATE));
        // 获取月的可能的最大值
        System.out.println(c.getActualMaximum(Calendar.MONTH));
        // 获取月的可能的最小值
        System.out.println(c.getActualMinimum(Calendar.MONTH));
        // 设置特定的时间
        c.set(2022, 1, 20, 12, 0);
        System.out.println(c.getTime());
        // 加月份，add方法会发生进位
        c.add(Calendar.MONTH, 11);
        System.out.println(c.getTime());
        // 减月份，roll方法不会发生进位
        c.roll(Calendar.MONTH, -4);
        System.out.println(c.getTime());
    }
}
