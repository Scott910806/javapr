package src.frequentlyusedclass;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * 包装BigDecimal类中的精度运算
 */
public class Arith {
    // 定义除法结果默认精度
    private static final int DEF_DIV_SCALE = 10;
    private Arith(){}
    // 加法
    public static double add(double value1, double value2){
        var v1 = BigDecimal.valueOf(value1);
        var v2 = BigDecimal.valueOf(value2);
        return v1.add(v2).doubleValue();
    }
    // 减法
    public static double sub(double value1, double value2){
        var v1 = BigDecimal.valueOf(value1);
        var v2 = BigDecimal.valueOf(value2);
        return v1.subtract(v2).doubleValue();
    }
    // 乘法
    public static double mul(double value1, double value2){
        var v1 = BigDecimal.valueOf(value1);
        var v2 = BigDecimal.valueOf(value2);
        return v1.multiply(v2).doubleValue();
    }
    // 除法
    public static double div(double value1, double value2){
        var v1 = BigDecimal.valueOf(value1);
        var v2 = BigDecimal.valueOf(value2);
        return v1.divide(v2, DEF_DIV_SCALE, RoundingMode.HALF_UP).doubleValue();
    }
}
