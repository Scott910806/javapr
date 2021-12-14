package src.learnjava.designModel;

/**
 * 枚举类：枚举类应该设计为不可变类，枚举类的属性应该设置为private final修饰，在构造方法中进行初始化
 */
public enum Gender {
    MALE("男"), FEMALE("女");
    private final String name;
    private Gender(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
