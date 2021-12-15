package learnjava;

class Vehicle{
    public String vehicleName;
    public Double price;
    {
        this.vehicleName = "ford";
        this.price = 10000.00;
    }
    public Vehicle(){
        System.out.println("交通工具无参数构造器");
    }
    public Vehicle(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public Vehicle(String vehicleName, Double price){
        this(vehicleName);
        this.price = price;
    }
}

class Car extends Vehicle{
    public String color;
    public String barnd;
    public Car(){
        System.out.println("这是一辆车");
    }
    public Car(String brand){
        super();
        this.barnd = brand;
    }
    public Car(String brand, String color){
        this(brand);
        this.color = color;
    }
}
public class VehicleTest{
    public static void main(String[] args) {
        // Vehicle vehicle1 = new Vehicle("Audi", 2000.0);
        // System.out.println(vehicle1.vehicleName);
        // System.out.println(vehicle1.price);

        Car mg = new Car("mazida","red");
        System.out.println(mg.vehicleName);
        System.out.println(mg.price);
        System.out.println(mg.color);
        System.out.println(mg.barnd);

    }
}
