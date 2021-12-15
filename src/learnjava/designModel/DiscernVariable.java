package learnjava.designModel;
/**
 * 内部类
 * 示例：外部类、内部类、内部类方法中有重名变量
 */
public class DiscernVariable {
   private String prop = "外部类的实例变量";
   private class InClass{
       private String prop = "内部类的实例变量";
       public void info(){
           String prop = "局部变量";
        // 外部类类名.this访问外部类中实例变量
           System.out.println("外部类：" + DiscernVariable.this.prop);
        // this访问内部类中实例变量
           System.out.println("内部类：" + this.prop);
           System.out.print("局部的：" + prop);
       }
   }
   public void test(){
       var ic = new InClass();
       ic.info();
   }
   public static void main(String[] args) {
       var dv = new DiscernVariable();
       dv.test();
   } 
}
