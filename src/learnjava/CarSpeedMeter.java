package learnjava;

/**
 * 抽象类的作用示例
 */
abstract class SpeedMeter{
    private double trunRate;
    public SpeedMeter(){}
    public abstract double calGrith();
    public void setTurnRate(double turnRate){
        this.trunRate = turnRate;
    }
    public double getSpeed(){
        return calGrith()*trunRate;
    }
}

public class CarSpeedMeter extends SpeedMeter{
    private double radius;
    public CarSpeedMeter(double radius){
        this.radius = radius;
    }
    public double calGrith(){
        return radius*2*Math.PI;
    }
    public static void main(String[] args) {
        SpeedMeter csm = new CarSpeedMeter(0.45);
        csm.setTurnRate(100);
        System.out.println(csm.getSpeed());
    }
}
