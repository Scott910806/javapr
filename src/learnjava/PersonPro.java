package learnjava;
/**
 * 不可变类(inmutable class)：类创建对象后，该对象的变量不可改变；
 * 此示例中，成员变量为引用数据类型，这种情况下要注意将该成员变量隐藏
 * 以下写法中，如果成员变量引用的对象发生了改变，“不可变对象”不会受影响
 */

class Name{
    private String firstNamePro;
    private String lastName;
    public Name(){}
    public Name(String firstNamePro, String lastName){
        this.firstNamePro = firstNamePro;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstNamePro;
    }
    public void setFirstName(String firstNamePro){
        this.firstNamePro = firstNamePro;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}

public class PersonPro {
    private final Name name;
    // 对象初始化时，创建一个跟入参name相同的对象，并赋值给对象成员name
    // 这样即使入参对象发生改变，已创建的PersonPro对象也不会受影响
    public PersonPro(Name name){
        this.name = new Name(name.getFirstName(), name.getLastName());
    }
    // 不能将成员变量暴露出来，故此处getter方法返回一个与成员name相同的新对象
    public Name getName(){
        return new Name(name.getFirstName(),name.getLastName());
    }
    public static void main(String[] args) {
        var n = new Name("scott","Ma");
        var p = new PersonPro(n);
        System.out.println(p.getName().getFirstName());
        System.out.println(p.getName().getLastName());
        n.setFirstName("rock");
        n.setLastName("Zhang");
        // 此处已创建的对象，不发生改变
        System.out.println(p.getName().getFirstName());
        System.out.println(p.getName().getLastName());
    }
}
