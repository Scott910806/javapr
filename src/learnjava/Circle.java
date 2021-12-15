package learnjava;
/**
 * 抽象类：只能被继承，不创建对象，abstract关键字修饰
 */
abstract class Shape{
    {
        System.out.println("执行shape的初始化块...");
    }
    private String color;
    // 定义抽象方法calPerimeter()、getType()
    public abstract double calPerimeter();
    public abstract String getType();
    // 构造器不能用于创建对象，用于被子类调用
    public Shape(){}
    public Shape(String color){
        System.out.println("执行shape的构造器...");
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
}

// 抽象类的子类，如果不用abstrac修饰，则必须实现抽象类中定义的全部抽象方法
class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    public Triangle(String color, double a, double b, double c){
        super(color);
        setSide(a, b, c);
    }
    public void setSide(double a, double b, double c){
        if(a>=b+c || b>=a+c || c>=a+b){
            System.out.print("三角形的两边之和必须大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // 实现抽象类中定义的抽象方法
    public double calPerimeter(){
        return a+b+c;
    }
    public String getType(){
        return "三角形";
    }    
}

// 抽象类的子类，如果不用abstrac修饰，则必须实现抽象类中定义的全部抽象方法
public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    // 实现抽象类中定义的抽象方法
    public double calPerimeter(){
        return radius*2*Math.PI;
    }
    public String getType(){
        return this.getColor() + "圆形";
    }
    public static void main(String[] args) {
        Shape s1 = new Triangle("yello", 3, 4, 5);
        Shape s2 = new Circle("red", 3);
        System.out.println(s1.calPerimeter());
        System.out.println(s1.getType());
        System.out.println(s2.calPerimeter());
        System.out.println(s2.getType());
    }
}
