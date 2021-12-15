package learnjava;

public class FinalVaribleTest {
    // final实例变量在声明语句中赋值
    final int a = 6;
    final String str;
    final int c;
    final static double d;
    // final类变量在声明语句中赋值
    final static float f = 6.78f;
    {
        // final实例变量在初始化块中赋值
        str = "hello";
    }
    static{
        // final类变量在类初始化块中赋值
        d = 3.1415926;
    }
    public FinalVaribleTest(){
        // final实例变量在构造器中赋值
        c = 'C';
    }
    public static void main(String[] args) {
        FinalVaribleTest ft = new FinalVaribleTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(FinalVaribleTest.d);
        System.out.println(FinalVaribleTest.f);
        System.out.println(ft.str);
    }
}
