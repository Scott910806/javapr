public class ArrayTest {
    public static void main(String[] args) {
        String[] objArr = new String[5];
        objArr[0] = "hello";
        objArr[1] = "world";
        objArr[2] = "scott";
        for(int i = 0; i < objArr.length; i++){
            System.out.println(objArr[i]);
        }

        // foreach遍历数组
        for(String obj : objArr){
            System.out.println(obj);
        }

        // 使用var定义循环变量
        for(var obj : objArr){
            System.out.println(obj);
        }
    }
}
