package src.learnjava.designmodul;



/**
 * 枚举类：枚举类应该设计为不可变类，枚举类的属性应该设置为private final修饰，在构造方法中进行初始化
 */
public enum Gender implements GenderDesc{
    // 每个枚举值有不同的行为
    MALE("男"){
        public void info(){
            System.out.println("这个枚举值代表男性");
        }
    },
    FEMALE("女"){
        public void info(){
            System.out.println("这个枚举值代表女性");
        }
    };
    private final String name;
    // 在构造器中给成员变量赋值
    private Gender(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    // 枚举值有相同的行为
    // public void info(){
    //     System.out.println("这里用于定义一个性别的枚举类");
    // }
}
