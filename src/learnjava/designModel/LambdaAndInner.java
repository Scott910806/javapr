package learnjava.designmodel;

@FunctionalInterface
interface Display{
    void display();
    default int add(int a, int b){
        return a + b;
    }
}

public class LambdaAndInner {
    private int age = 12;
    private static String book = "共同基金常识";
    public void test(){
        String name = "scott";
        Display dis = () -> {
            // 访问外部类的实例变量
            System.out.println(age);
            // 访问外部类的类变量
            System.out.println(book);
            // 访问effective fina的局部变量name
            System.out.println(name);
        };
        dis.display();
        // 在lambda代码块不能调动接口中的default方法
        System.out.println(dis.add(1, 2));
    }
    public static void main(String[] args) {
        LambdaAndInner lai = new LambdaAndInner();
        lai.test();
    }
}
