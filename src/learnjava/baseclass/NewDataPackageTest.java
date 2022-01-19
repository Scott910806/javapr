package src.learnjava.baseclass;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;


public class NewDataPackageTest {
    public static void main(String[] args) {
        // ------ 关于Clock 的用法 -----
        var clock = Clock.systemUTC();
        // 获取当前时间
        System.out.println(clock.instant());
        // 获取当前时间的毫秒数
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        // ------ 关于Duration 的用法 -----
        var d = Duration.ofSeconds(6000);
        System.out.println(d.toMinutes());

        // 
        var clock2 = Clock.offset(clock, d);
        System.out.println(clock2.instant());
        
        // ------ 关于Instant 的用法 -----
        var instant = Instant.now();
        System.out.println(instant);
        var instant2 = instant.plusMillis(6000);
        System.out.println(instant2);
        var instant3 = Instant.parse("2022-01-20T10:12:35.333Z");
        System.out.println(instant3);
        var instant4 = instant3.plus(Duration.ofHours(4).plusHours(30));
        System.out.println(instant4);
        var instant5 = instant3.minus(Duration.ofDays(5));
        System.out.println(instant5);

        // ------ 关于LocalDateTime 的用法 -----
        var localDate = LocalDate.now();
        System.out.println(localDate);
        localDate = LocalDate.of(2022, 01, 29);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
        localDate = localDate.plusMonths(1).plusDays(1);
        System.out.println(localDate);

        // ------ 关于LocalDateTime 的用法 -----
        var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); 
        //  plusHours()方法返回的仍然是LocalDateTime对象，所以可以继续调用实例方法plusMinutes
        var featureTime = localDateTime.plusHours(8).plusMinutes(40);
        System.out.println(featureTime);

        // ------ 关于Year、YearMonth、MonthDay 的用法 -----
        var year = Year.now();
        System.out.println(year);
        year = year.plusYears(5);
        System.out.println(year);
        var ym = year.atMonth(10);
        System.out.println(ym);
        var ym1 = YearMonth.now();
        System.out.println(ym1);
        ym = ym.plusYears(3).minusMonths(6);
        System.out.println(ym);
        var ym2 = YearMonth.now(clock);
        System.out.println(ym2);
        var md = MonthDay.now();
        System.out.println(md);
        md = md.with(Month.OCTOBER).withDayOfMonth(22);
        System.out.println(md);
    }
}
