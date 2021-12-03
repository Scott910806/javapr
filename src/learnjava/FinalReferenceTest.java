package src.learnjava;
/**
 * final修饰的引用类型的变量，该变量不能被重新赋值，但被引用的实际对象可以改变
 */

class Person{
    private int age;
    public Person(){}
    public Person(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age>0 && age<100){
            this.age = age;
        }else{
            System.out.println("输入age不合法");
        }
    }
}
public class FinalReferenceTest {
    public static void main(String[] args) {
        // final修饰的引用类型变量
        final Person p = new Person(45);
        p.setAge(26);
        System.out.println(p.getAge());
        // 以下赋值语句会报错
        // p = null;
    }
    
}
