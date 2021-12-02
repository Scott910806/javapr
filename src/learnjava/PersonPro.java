package src.learnjava;
/**
 * 不可变类(inmutable class)：类创建对象后，该对象的变量不可改变；
 * 此示例中，成员变量为引用数据类型
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
    public PersonPro(Name name){
        this.name = new Name(name.getFirstName(), name.getLastName());
    }
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
        System.out.println(p.getName().getFirstName());
        System.out.println(p.getName().getLastName());
    }
}
