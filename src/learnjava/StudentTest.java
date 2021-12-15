package learnjava;

class Student{
    /**
     * 
     */
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public Student(){}
    public Student(String name, int age, String gender, String phone, String address, String email){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age > 0 && age < 30){
            this.age = age;
        }else{
            System.out.println("您输入年龄不合法");
            return;
        }
    }

    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        if(gender == "男" || gender == "女"){
            this.gender = gender;
        }else{
            System.out.println("您输入的性别不合法");
        }    
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        if(phone.length() < 16 && phone.length() > 4){
            this.phone = phone;        
        }else{
            System.out.println("您输入的手机号不合法");
        }
    
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void eat(){
        System.out.println("吃: " + "日啖荔枝三百颗，不妨长作岭南人");
    }
    public void drink(){
        System.out.println("喝: " + "葡萄美酒夜光杯，欲饮琵琶马上催");
    }
    public void sleep(){
        System.out.println("睡: " + "大梦谁先觉？平生我自如");
    }
    public void play(){
        System.out.println("玩: " + "牧童骑黄牛，歌声振林樾");
    }
}

class QueryStuden{
    private Student scott = new Student("scott", 21, "man", "18900010002", "shanghai", "scott@sh.com");
    private Student rock = new Student("rock", 22, "man", "18900010003", "beijing", "rock@sh.com");
    private Student micheal = new Student("micheal", 23, "man", "18900010004", "shenzhen", "micheal@sh.com");
    private Student sam = new Student("sam", 30, "man", "18900010004", "nanjing", "sam@sh.com");
    private Student liya = new Student("liya", 26, "woman", "18900010005", "chengdu", "liya@sh.com");
    private Student luna = new Student("liya", 28, "woman", "19000010006", "chengdu", "luna@sh.com");
    private Student[] contectList = {scott, rock, micheal, sam, liya, luna};

    // 根据name、address、email查询student
    public void queryStudent(String str){
        for (Student student : contectList) {
            if (str == student.getName()||str == student.getAddress()|| str == student.getEmail()){
                System.out.println("name:" + student.getName() + " age:" + student.getAge()
                 + " gender:" + student.getGender() + " phone:" + student.getPhone() + " address:"
                  + student.getAddress() + " email:" + student.getEmail());
                student.eat();
                student.drink();
                student.play();
                student.sleep();
            }else{
                System.out.println("查无此人");
            }
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        var studentList = new QueryStuden();
        studentList.queryStudent("chengdu");
    }
}