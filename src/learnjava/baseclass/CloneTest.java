package src.learnjava.baseclass;

class Address{
    String detial;
    public Address(String detial){
        this.detial = detial;
    }
}

class User implements Cloneable{
    int age;
    Address address;
    public User(int age){
        this.age = age;
        address = new Address("上海浦东");
    }
    public User clone() throws CloneNotSupportedException{
        return (User)super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var u1 = new User(28);
        var u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
    }
}
