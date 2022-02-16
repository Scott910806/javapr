package src.generictest;

class DemoPro<T>{
    private T info;
    public DemoPro(T info){
        this.info = info;
    }
    public T getInfo(){
        return info;
    }
    public void setInfo(T info){
        this.info = info;
    }
}

public class WildcardsSuper {
    public static void main(String[] args) {
        DemoPro<Object> demoPro = new DemoPro<>("hello world");
        DemoPro<? super String> sDemoPro = demoPro;
        // 逆变泛型可以调用泛型类型作为形参的方法
        sDemoPro.setInfo("hello scott");
        // 逆变泛型调用泛型类型作为返回值的方法时，只能当做Object类型处理
        Object o = sDemoPro.getInfo();
        System.out.println(o);
    }
    
}
