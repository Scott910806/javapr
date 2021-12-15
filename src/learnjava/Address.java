package learnjava;
/**
 * 不可变类(inmutable class)：类创建对象后，该对象的变量不可改变；
 * 此示例中，成员变量为不可变数据类型
 * 1、用private和fina修饰成员变量
 * 2、只提供getter方法，不提供setter方法
 * 3、如果有必要，重写Object类的equals()、hashCode()方法
 */
public class Address {
    private final String detial;
    private final String postCode;
    public Address(String detial, String postCode){
        this.detial = detial;
        this.postCode = postCode;
    }
    public String getDetial(){
        return this.detial;
    }
    public String getPostCode(){
        return this.postCode;
    }
    // 重写equals方法
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj!=null && obj.getClass()==Address.class){
            Address ad = (Address)obj;
            // 重新定义相同的条件
            // 此处调用了String类的实例方法equals(两个字符串序列相同，则返回true)
            if(this.getDetial().equals(ad.getDetial()) && this.getPostCode().equals(ad.getPostCode())){
                return true;
            }
        }
        return false;
    }

}
