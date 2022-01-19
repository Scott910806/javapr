
package src.learnjava.designmodul;

/**
 * 包含抽象方法的枚举类
 */
public enum Operation {
    // 所有的枚举值都必须实现枚举类中的抽象方法
    PLUS{
        public double eval(double x, double y){
            return x + y;
        }
    },
    MINUS{
        public double eval(double x, double y){
            return x - y;
        }
    },
    TIMES{
        public double eval(double x, double y){
            return x * y;
        }
    },
    DIVIDE{
        public double eval(double x, double y){
            return x / y;
        }
    };
    public abstract double eval(double x, double y);
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(2, 3));
        System.out.println(Operation.MINUS.eval(2, 3));
        System.out.println(Operation.TIMES.eval(2, 3));
        System.out.println(Operation.DIVIDE.eval(2, 3));
    }
}
