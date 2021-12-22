package learnjava.baseclass;

import java.util.Scanner;

public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        // System.in 代表标准输入
        var sc = new Scanner(System.in);
        // 使用分割符(使用换行符作为分割符，则将整行输出)
        sc.useDelimiter("\n");
        while(sc.hasNext()){
            System.out.println("键盘输入内容是：" + sc.next());
        }
    }
}
