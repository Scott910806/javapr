package learnjava.designmodel;

public class EnumTest {
    public void judge(SeasonEnum s){
        switch(s){
            case SPRING:{
                System.out.println("春暖花开");
                break;
            }
            case SUMMER:{
                System.out.println("夏日炎炎");
                break;
            }
            case FALL:{
                System.out.println("秋高气爽");
                break;
            }
            case WINTER:{
                System.out.println("凛冬已至");
                break;
            }
        }
    }
    public static void main(String[] args) {
        // 遍历枚举类的所有实例
        for(SeasonEnum s: SeasonEnum.values()){
            System.out.println(s);
        }
        new EnumTest().judge(SeasonEnum.WINTER);
        // 使用枚举值
        System.out.println(Gender.MALE.getName());
        Gender.MALE.info();
    }
}
