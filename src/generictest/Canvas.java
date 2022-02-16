package src.generictest;
/**
 * <? extends E> 通配符上限（协变）
 * <? super E> 通配符下限（逆变）
 */
import java.util.ArrayList;
import java.util.List;

abstract class Shapes{
    public abstract void draw(Canvas c);
}

class Cicle extends Shapes{
    public void draw(Canvas c){
        System.out.println("在画布" + c + "上画一个圆形");
    }
}

class Rectangle extends Shapes{
    public void draw(Canvas c){
        System.out.println("在画布" + c + "上画一个矩形");
    }
}

public class Canvas {
    // 通配数据类型为Shapes及其子类的List
    public void drawAll(List<? extends Shapes> shapes){
        for(Shapes shape : shapes){
            shape.draw(this);
        }
    }
    public static void main(String[] args) {
        List<Shapes> sh = new ArrayList<>();
        sh.add(new Cicle());
        sh.add(new Rectangle());
        Canvas ca = new Canvas();
        ca.drawAll(sh);
    }
}
