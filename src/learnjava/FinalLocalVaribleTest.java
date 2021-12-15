package learnjava;

public class FinalLocalVaribleTest {
    public void test(final int age){
        // final修饰的形参的值是根据调用方法是传入的参数确定的，不能通过下面方式赋值
        // age = 18;
    }
    public static void main(String[] args) {
        // final修饰的局部变量在声明语句中赋值
        final var str = "hello";
        final int a;
        // final修饰的局部变量，第一次赋值成功
        a = 9;
        // 以下赋值语句会失败
        // a = 6;
    }
}
