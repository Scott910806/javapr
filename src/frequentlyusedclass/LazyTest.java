package src.frequentlyusedclass;

import java.util.Calendar;

public class LazyTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        // 此方法没有惰性
        cal.set(2021, 7, 31);
        // 此方法具有惰性，将月设置为9月
        cal.set(Calendar.MONTH, 8);
        // 如果直接调用下面方法，日期为10月1日，因为9月没有31日
        // System.out.println(cal.getTime());

        // 将日设置为5
        cal.set(Calendar.DATE, 5);
        // 将输出9月5日，而不是10月5日
        System.out.println(cal.getTime());
    }
}
