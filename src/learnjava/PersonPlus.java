package src.learnjava;
/**
 * 不可变类(inmutable class)：类创建对象后，该对象的变量不可改变；
 * 此示例中，成员变量为引用数据类型
 * 以下写法中，如果成员变量引用的对象发生了改变，“不可变对象”会受影响
 */
class NamePlus{
    private String firstNamePlus;
    private String lastName;
    public NamePlus(){}
    public NamePlus(String firstNamePlus, String lastName){
        this.firstNamePlus = firstNamePlus;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstNamePlus;
    }
    public void setFirstName(String firstNamePlus){
        this.firstNamePlus = firstNamePlus;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
public class PersonPlus {
    private final Name name;
    // 对象初始化时，直接使用了入参中的name对象，虽然成员变量name指向入参中的name不会改变，
    // 但是入参中的name是可变的，一旦发生变化，则已创建的对象中的成员变量name也会改变
    public PersonPlus(Name name){
        this.name = name;
    }
    public Name getName(){
        return this.name;
    }
    public static void main(String[] args) {
        var n = new Name("micheal","shen");
        var p = new PersonPlus(n);
        System.out.println(p.getName().getFirstName());
        n.setFirstName("paul");
        System.out.println(p.getName().getFirstName());
    }
}
